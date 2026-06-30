package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaActionSheetImpl */
/* loaded from: classes15.dex */
public class C3292x6b683b9c implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3420x22c7b7e {

    /* renamed from: cancelTitle */
    private java.lang.String f12716xa1b2fffe;

    /* renamed from: sheet */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f12718x6855d5f;

    /* renamed from: title */
    private java.lang.String f12719x6942258;

    /* renamed from: mDestructiveIndex */
    private int f12717xfbaaefd = -1;

    /* renamed from: buttonTitles */
    private java.util.List<java.lang.String> f12715x39b58eed = new java.util.ArrayList();

    /* renamed from: buttonCallbacks */
    private java.util.List<com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619> f12714xf02bd9bc = new java.util.ArrayList();

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3420x22c7b7e
    /* renamed from: addButtonImpl */
    public void mo26341x168bd3f3(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        this.f12715x39b58eed.add(str);
        this.f12714xf02bd9bc.add(abstractC3623x3b485619);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3420x22c7b7e
    /* renamed from: isShowing */
    public boolean mo26342x58a9c73b() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3420x22c7b7e
    /* renamed from: setCancelButtonTitle */
    public void mo26343x205bd72a(java.lang.String str) {
        this.f12716xa1b2fffe = str;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3420x22c7b7e
    /* renamed from: setDestructiveIndex */
    public void mo26344x3577e0f2(int i17) {
        this.f12717xfbaaefd = i17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3420x22c7b7e
    /* renamed from: setTitle */
    public void mo26345x53bfe316(java.lang.String str) {
        this.f12719x6942258 = str;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3420x22c7b7e
    /* renamed from: show */
    public void mo26346x35dafd() {
        final android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (m27313x7608d9c4 != null) {
            boolean z17 = this.f12719x6942258 != null;
            this.f12718x6855d5f = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(m27313x7608d9c4, 1, z17);
            if (z17) {
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m27313x7608d9c4).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570805by3, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odb);
                textView.setText(this.f12719x6942258);
                textView.setTextSize(14.0f);
                textView.setGravity(17);
                this.f12718x6855d5f.s(inflate, false);
            }
            this.f12718x6855d5f.f293405n = new db5.o4() { // from class: com.tencent.kinda.framework.widget.base.KindaActionSheetImpl.1
                @Override // db5.o4
                /* renamed from: onCreateMMMenu */
                public void mo887xc459429a(db5.g4 g4Var) {
                    int i17 = 0;
                    for (java.lang.String str : com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3292x6b683b9c.this.f12715x39b58eed) {
                        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3292x6b683b9c.this.f12717xfbaaefd < 0 || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3292x6b683b9c.this.f12717xfbaaefd != i17) {
                            g4Var.add(0, i17, 0, str);
                        } else {
                            g4Var.d(i17, m27313x7608d9c4.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), str);
                        }
                        i17++;
                    }
                }
            };
            this.f12718x6855d5f.f293414s = new db5.t4() { // from class: com.tencent.kinda.framework.widget.base.KindaActionSheetImpl.2
                @Override // db5.t4
                /* renamed from: onMMMenuItemSelected */
                public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
                    if (i17 < com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3292x6b683b9c.this.f12714xf02bd9bc.size()) {
                        ((com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3292x6b683b9c.this.f12714xf02bd9bc.get(i17)).mo25801x2e7a5e();
                    }
                }
            };
            java.lang.String str = this.f12716xa1b2fffe;
            if (str != null && !str.isEmpty()) {
                this.f12718x6855d5f.m(this.f12716xa1b2fffe);
            }
            this.f12718x6855d5f.v();
        }
    }
}
