package hf2;

/* loaded from: classes10.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f362598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f362599f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(hf2.p1 p1Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f362598e = p1Var;
        this.f362599f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hf2.g1(this.f362598e, this.f362599f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.g1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        java.lang.Object j17;
        int i17;
        r45.ei0 ei0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f362597d;
        jz5.f0 f0Var3 = jz5.f0.f384359a;
        hf2.p1 p1Var = this.f362598e;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.ee6 b76 = p1Var.f362669a.b7(this.f362599f, 0, "");
            this.f362597d = 1;
            p1Var.getClass();
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            boolean z17 = b76.f454905h.f455063e.size() > 0;
            boolean z18 = b76.f454905h.f455062d.size() > 0;
            hf2.x xVar = p1Var.f362669a;
            android.graphics.Bitmap bitmap = ((je2.g) xVar.m56788xbba4bfc0(je2.g.class)).f380756h;
            java.lang.String str = p1Var.f362670b;
            if (z18 && bitmap != null) {
                java.util.LinkedList textItemRestoreDataList = b76.f454905h.f455062d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textItemRestoreDataList, "textItemRestoreDataList");
                r45.ji0 ji0Var = (r45.ji0) kz5.n0.Z(textItemRestoreDataList);
                if (ji0Var != null) {
                    if (ji0Var.f459365q == null) {
                        ji0Var.f459365q = new r45.he6();
                    }
                    r45.he6 he6Var = ji0Var.f459365q;
                    he6Var.f457631d = true;
                    he6Var.f457633f = bitmap.getHeight();
                    he6Var.f457632e = bitmap.getWidth();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dropBitmap set genExtraConfig:");
                    r45.he6 genExtraConfig = ji0Var.f459365q;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(genExtraConfig, "genExtraConfig");
                    sb6.append(pm0.b0.g(genExtraConfig));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("dropBitmap,needPic:");
            sb7.append(z17);
            sb7.append(",needText:");
            sb7.append(z18);
            sb7.append(",lastTextBitmap:");
            sb7.append(bitmap);
            sb7.append('(');
            sb7.append(bitmap != null ? new java.lang.Integer(bitmap.getWidth()) : null);
            sb7.append('*');
            sb7.append(bitmap != null ? new java.lang.Integer(bitmap.getHeight()) : null);
            sb7.append("), ");
            sb7.append(je2.g.f380753u.a(b76));
            sb7.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
            f0Var = f0Var3;
            qc0.g1 wi6 = ((pc0.i2) ((qc0.h1) i95.n0.c(qc0.h1.class))).wi(xVar.O6(), b76, new qc0.p1(new hf2.i1(p1Var, nVar), new hf2.j1(p1Var, nVar), new hf2.k1(p1Var, nVar), new hf2.l1(p1Var)));
            if (wi6 != null) {
                p1Var.f362672d = wi6;
                if (z18) {
                    if (bitmap != null) {
                        r45.ei0 editorItemRestoreData = b76.f454905h;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(editorItemRestoreData, "editorItemRestoreData");
                        i17 = 1;
                        ei0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7) wi6).h(1, editorItemRestoreData, bitmap);
                    } else {
                        i17 = 1;
                        ei0Var = null;
                    }
                    xVar.t7("dropBitmap", ei0Var);
                } else {
                    i17 = 1;
                }
                if (!z17) {
                    qc0.g1.a(wi6, null, i17, null);
                }
                f0Var2 = f0Var;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "dropBitmap fail,sticker editor container is null!");
                nVar.a(java.lang.Boolean.FALSE);
            }
            j17 = rVar.j();
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j17 = obj;
            f0Var = f0Var3;
        }
        boolean booleanValue = ((java.lang.Boolean) j17).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p1Var.f362670b, "dropBitmap suc:" + booleanValue);
        return f0Var;
    }
}
