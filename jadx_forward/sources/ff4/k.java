package ff4;

/* loaded from: classes4.dex */
public final class k extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ff4.l f343232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ff4.m f343233b;

    public k(ff4.l lVar, ff4.m mVar) {
        this.f343232a = lVar;
        this.f343233b = mVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (gm0.j1.b().m()) {
            ff4.l lVar = this.f343232a;
            java.util.LinkedList linkedList = lVar.f343234a;
            ff4.m mVar = this.f343233b;
            if (linkedList != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
                if (!linkedList.isEmpty()) {
                    java.util.LinkedList linkedList2 = lVar.f343234a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList2);
                    r45.b50 b50Var = (r45.b50) linkedList2.getFirst();
                    java.util.LinkedList linkedList3 = ff4.m.f343236h;
                    int i17 = b50Var.f452063d;
                    java.util.LinkedList linkedList4 = lVar.f343234a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList4);
                    linkedList4.removeFirst();
                    int i18 = b50Var.f452063d;
                    if (i18 == 1) {
                        ef4.w.f334001t.l().mo50293x3498a0(new ff4.f(mVar, b50Var, this));
                        return;
                    }
                    if (i18 == 2) {
                        ef4.w.f334001t.l().mo50293x3498a0(new ff4.g(mVar, b50Var, this));
                        return;
                    }
                    if (i18 == 3) {
                        ef4.w.f334001t.l().mo50293x3498a0(new ff4.h(mVar, b50Var, this));
                        return;
                    }
                    if (i18 == 4) {
                        ef4.w.f334001t.l().mo50293x3498a0(new ff4.j(mVar, b50Var, this));
                        return;
                    } else if (i18 != 7) {
                        mo50305x3d8a09a2(0);
                        return;
                    } else {
                        ef4.w.f334001t.l().mo50293x3498a0(new ff4.i(mVar, b50Var, this));
                        return;
                    }
                }
            }
            com.p314xaae8f345.mm.p944x882e457a.o oVar = mVar.f343237d;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncResponse");
            r45.kf6 kf6Var = (r45.kf6) fVar;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
            r45.jf6 jf6Var = (r45.jf6) fVar2;
            byte[] c17 = o45.qi.c(jf6Var.f459321e.f453374f.g(), kf6Var.f460199f.f453374f.g());
            if (c17 != null && c17.length > 0) {
                w11.c2.f523524a.d(c17, true);
            }
            jf6Var.f459321e.d(c17);
            if ((jf6Var.f459320d & kf6Var.f460198e) == 0) {
                com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = mVar.f343240g;
                if (u0Var != null) {
                    u0Var.mo815x76e0bfae(0, 0, "", mVar);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                    throw null;
                }
            }
            com.p314xaae8f345.mm.p971x6de15a2e.s m47995xb7ba1aa7 = mVar.m47995xb7ba1aa7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m47995xb7ba1aa7, "dispatcher(...)");
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = mVar.f343240g;
            if (u0Var2 != null) {
                mVar.mo807x6c193ac1(m47995xb7ba1aa7, u0Var2);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
        }
    }
}
