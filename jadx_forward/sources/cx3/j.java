package cx3;

/* loaded from: classes15.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17169xebd2a739 f306097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17169xebd2a739 c17169xebd2a739) {
        super(0);
        this.f306097d = c17169xebd2a739;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17169xebd2a739 c17169xebd2a739 = this.f306097d;
        if (((java.util.ArrayList) c17169xebd2a739.f239610d).size() > 30) {
            c17169xebd2a739.m0().f();
            bx3.a aVar = c17169xebd2a739.f239619g;
            if (aVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            aVar.notifyDataSetChanged();
        } else {
            c17169xebd2a739.p0();
            c17169xebd2a739.m0().e(true);
        }
        return jz5.f0.f384359a;
    }
}
