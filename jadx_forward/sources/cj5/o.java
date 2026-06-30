package cj5;

/* loaded from: classes.dex */
public final class o extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f123738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r2 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 T6() {
        /*
            r3 = this;
            com.tencent.mm.ui.widget.dialog.f4 r0 = r3.f123738d
            r1 = 1
            if (r0 == 0) goto L11
            r2 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto Lf
            r2 = r1
        Lf:
            if (r2 == 0) goto L30
        L11:
            androidx.appcompat.app.AppCompatActivity r0 = r3.m158354x19263085()
            int r2 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n
            com.tencent.mm.ui.widget.dialog.e4 r2 = new com.tencent.mm.ui.widget.dialog.e4
            r2.<init>(r0)
            r0 = 2131756354(0x7f100542, float:1.9143613E38)
            java.lang.String r0 = r3.m158362x2fec8307(r0)
            r2.f293309c = r0
            r0 = 2
            r2.f293313g = r0
            r2.f293311e = r1
            com.tencent.mm.ui.widget.dialog.f4 r0 = r2.c()
            r3.f123738d = r0
        L30:
            com.tencent.mm.ui.widget.dialog.f4 r0 = r3.f123738d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cj5.o.T6():com.tencent.mm.ui.widget.dialog.f4");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f123738d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        this.f123738d = null;
    }
}
