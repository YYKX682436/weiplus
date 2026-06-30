package cj5;

/* loaded from: classes.dex */
public final class o extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f42205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r2 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.ui.widget.dialog.f4 T6() {
        /*
            r3 = this;
            com.tencent.mm.ui.widget.dialog.f4 r0 = r3.f42205d
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
            androidx.appcompat.app.AppCompatActivity r0 = r3.getActivity()
            int r2 = com.tencent.mm.ui.widget.dialog.f4.f211790n
            com.tencent.mm.ui.widget.dialog.e4 r2 = new com.tencent.mm.ui.widget.dialog.e4
            r2.<init>(r0)
            r0 = 2131756354(0x7f100542, float:1.9143613E38)
            java.lang.String r0 = r3.getString(r0)
            r2.f211776c = r0
            r0 = 2
            r2.f211780g = r0
            r2.f211778e = r1
            com.tencent.mm.ui.widget.dialog.f4 r0 = r2.c()
            r3.f42205d = r0
        L30:
            com.tencent.mm.ui.widget.dialog.f4 r0 = r3.f42205d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cj5.o.T6():com.tencent.mm.ui.widget.dialog.f4");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f42205d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        this.f42205d = null;
    }
}
