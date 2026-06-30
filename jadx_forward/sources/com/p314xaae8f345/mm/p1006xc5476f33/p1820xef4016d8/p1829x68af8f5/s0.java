package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes4.dex */
public class s0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 f227442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 f227443e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 c16346x4deb5237, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var) {
        super(false);
        this.f227443e = c16346x4deb5237;
        this.f227442d = b1Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 c16346x4deb5237 = this.f227443e;
        if (c16346x4deb5237.f227336e != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = this.f227442d;
            if (b1Var.f227366m != null) {
                c16346x4deb5237.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16347xceed145b c16347xceed145b = b1Var.f227366m;
                if (c16347xceed145b == null) {
                    return;
                }
                boolean z17 = !c16347xceed145b.P1;
                c16346x4deb5237.f227337f = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "click to mute: %s", java.lang.Boolean.valueOf(z17));
                b1Var.f227366m.mo61536x764d819b(c16346x4deb5237.f227337f);
                boolean z18 = c16346x4deb5237.f227337f;
                fp.e eVar = c16346x4deb5237.f227339h;
                if (!z18) {
                    eVar.b();
                    c16346x4deb5237.f227340i = true;
                } else if (c16346x4deb5237.f227340i) {
                    eVar.a();
                    c16346x4deb5237.f227340i = false;
                }
                c16346x4deb5237.i(b1Var);
            }
        }
    }
}
