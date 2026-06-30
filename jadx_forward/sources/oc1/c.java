package oc1;

/* loaded from: classes.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f425675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425676e;

    public c(android.content.Context context, java.lang.String str) {
        this.f425675d = context;
        this.f425676e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f425675d;
        android.widget.Toast m125854x26a183b = dp.a.m125854x26a183b(context, "", 3000);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d0k, null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(this.f425676e);
        m125854x26a183b.setGravity(17, 0, 0);
        m125854x26a183b.setView(inflate);
        m125854x26a183b.show();
    }
}
