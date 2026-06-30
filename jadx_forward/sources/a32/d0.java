package a32;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 f82543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5) {
        super(0);
        this.f82543d = c13394xa8c361b5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5 = this.f82543d;
        t85.d x17 = c13394xa8c361b5.f180202g.x(c13394xa8c361b5.f180203h);
        if (x17 != null) {
            u22.l lVar = u22.r.f505539p;
            r45.p64 p64Var = x17.f497989a;
            if (lVar.a(p64Var)) {
                v85.e eVar = v85.e.f515636a;
                r45.q64 q64Var = v85.e.f515641f;
                java.util.LinkedList lensInfoList = q64Var.f465243d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lensInfoList, "lensInfoList");
                java.util.Iterator it = lensInfoList.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.p64) it.next()).f464325d, p64Var.f464325d)) {
                        break;
                    }
                    i17++;
                }
                java.util.LinkedList linkedList = q64Var.f465243d;
                if (i17 >= 0 && i17 < linkedList.size()) {
                    linkedList.remove(i17);
                }
                linkedList.add(0, p64Var);
                if (linkedList.size() > 4) {
                    linkedList.remove(linkedList.size() - 1);
                }
                eVar.b();
            }
        }
        return jz5.f0.f384359a;
    }
}
