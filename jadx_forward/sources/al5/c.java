package al5;

/* loaded from: classes10.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22596xee3b48b1 f87404e;

    public c(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22596xee3b48b1 c22596xee3b48b1, java.lang.String str) {
        this.f87404e = c22596xee3b48b1;
        this.f87403d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22596xee3b48b1 c22596xee3b48b1 = this.f87404e;
        c22596xee3b48b1.f292775f = false;
        c22596xee3b48b1.f292773d.setText(this.f87403d);
    }
}
