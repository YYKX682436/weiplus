package oc1;

/* loaded from: classes.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f425674d;

    public b(android.content.Context context) {
        this.f425674d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f425674d;
        android.widget.Toast m125854x26a183b = dp.a.m125854x26a183b(context, "", 3000);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569912rq, null);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568889oe2)).setImageResource(com.p314xaae8f345.mm.R.raw.f80061xfad483b7);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3);
        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2c));
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new oc1.a(this, textView));
        m125854x26a183b.setGravity(17, 0, 0);
        m125854x26a183b.setView(inflate);
        m125854x26a183b.show();
    }
}
