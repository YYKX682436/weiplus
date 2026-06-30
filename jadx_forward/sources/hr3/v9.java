package hr3;

/* loaded from: classes11.dex */
public class v9 extends l75.v0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 f365640e;

    public v9(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668) {
        this.f365640e = c16861xdcf09668;
    }

    @Override // l75.v0
    public void a(java.lang.Object obj, android.os.Looper looper) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        if (looper == null) {
            looper = android.os.Looper.getMainLooper();
        }
        super.a(null, looper);
    }

    @Override // l75.v0
    public void h(java.lang.Object obj, java.lang.Object obj2) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        java.lang.String str = (java.lang.String) obj2;
        boolean equals = str.equals("show_btn");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365640e;
        if (equals) {
            c16861xdcf09668.L.d1();
            throw null;
        }
        if (str.equals("hide_btn")) {
            c16861xdcf09668.L.d1();
            throw null;
        }
    }
}
