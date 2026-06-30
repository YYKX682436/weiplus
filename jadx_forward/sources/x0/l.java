package x0;

/* loaded from: classes14.dex */
public final class l {
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.Object a(yz5.l lVar, yz5.l lVar2, yz5.a block) {
        x0.m d1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        if (lVar == null && lVar2 == null) {
            return block.mo152xb9724478();
        }
        x0.m mVar = (x0.m) x0.z.f532495a.a();
        if (mVar == null || (mVar instanceof x0.e)) {
            d1Var = new x0.d1(mVar instanceof x0.e ? (x0.e) mVar : null, lVar, lVar2, true);
        } else {
            if (lVar == null) {
                return block.mo152xb9724478();
            }
            d1Var = mVar.r(lVar);
        }
        try {
            x0.m i17 = d1Var.i();
            try {
                return block.mo152xb9724478();
            } finally {
                d1Var.o(i17);
            }
        } finally {
            d1Var.c();
        }
    }
}
