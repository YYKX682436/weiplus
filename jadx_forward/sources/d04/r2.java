package d04;

/* loaded from: classes8.dex */
public final class r2 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 f307031d;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 c17334xac4daa10) {
        this.f307031d = c17334xac4daa10;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 c17334xac4daa10;
        d04.i iVar;
        d04.d2 m68830xd55f9398;
        d04.d2 m68830xd55f93982;
        d04.d2 m68830xd55f93983;
        d04.j2 data = (d04.j2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductNewMaskDecorView", "onItemClickListener onClick position: " + i17);
        if (data.f306980e == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductNewMaskDecorView", "onScanProductItemClick uniqueId: " + data.f306979d.f495663a);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 c17334xac4daa102 = this.f307031d;
            synchronized (c17334xac4daa102.A) {
                obj = c17334xac4daa102.A.get(java.lang.Long.valueOf(data.f306979d.f495663a));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 c17334xac4daa103 = this.f307031d;
            synchronized (c17334xac4daa103.f241319z) {
                obj2 = c17334xac4daa103.f241319z.get(java.lang.Integer.valueOf(data.f306979d.f495671i));
            }
            sz3.w0 w0Var = (sz3.w0) obj2;
            java.lang.String str = w0Var != null ? w0Var.f495672j : null;
            boolean z17 = false;
            if (str == null || str.length() == 0) {
                boolean z18 = w0Var != null && w0Var.f495670h == 1;
                if (w0Var != null) {
                    w0Var.f495670h = 1;
                }
                int i18 = w0Var != null ? w0Var.f495671i : -1;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 c17334xac4daa104 = this.f307031d;
                java.lang.Integer num = c17334xac4daa104.f241309p;
                if (num != null && num.intValue() != i18) {
                    java.lang.Integer num2 = c17334xac4daa104.f241309p;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                    jz5.l h17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.h(c17334xac4daa104, num2.intValue());
                    int intValue = h17 != null ? ((java.lang.Number) h17.f384366d).intValue() : -1;
                    d04.j2 j2Var = h17 != null ? (d04.j2) h17.f384367e : null;
                    sz3.w0 w0Var2 = j2Var != null ? j2Var.f306979d : null;
                    if (w0Var2 != null) {
                        w0Var2.f495670h = 0;
                    }
                    if (intValue >= 0) {
                        m68830xd55f93982 = c17334xac4daa104.m68830xd55f9398();
                        if (intValue < m68830xd55f93982.mo1894x7e414b06()) {
                            m68830xd55f93983 = c17334xac4daa104.m68830xd55f9398();
                            m68830xd55f93983.m8147xed6e4d18(intValue);
                        }
                    }
                }
                this.f307031d.f241309p = w0Var != null ? java.lang.Integer.valueOf(w0Var.f495671i) : -1;
                if (!z18) {
                    m68830xd55f9398 = this.f307031d.m68830xd55f9398();
                    m68830xd55f9398.m8147xed6e4d18(i17);
                }
                z17 = z18;
            }
            if (obj == null || obj2 == null || z17 || (iVar = (c17334xac4daa10 = this.f307031d).f241314u) == null) {
                return;
            }
            iVar.a(itemView, (sz3.w0) obj2, (sz3.c1) obj, c17334xac4daa10.getF241318y(), i17);
        }
    }
}
