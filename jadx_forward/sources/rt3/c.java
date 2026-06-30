package rt3;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rt3.e f481057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f481058f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rt3.e eVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481057e = eVar;
        this.f481058f = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rt3.c(this.f481057e, this.f481058f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt3.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f481056d;
        int i18 = 1;
        vt3.p pVar = null;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rt3.j jVar = rt3.j.f481073a;
            this.f481057e.getClass();
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20420xb726d1df()), 1);
            this.f481056d = 1;
            c17 = jVar.c(b17, null, this.f481058f, this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c17 = obj;
        }
        r45.z51 z51Var = (r45.z51) c17;
        if (z51Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetCameraTemplateGgi", "getFavTemplateListRep is null");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<r45.rz6> linkedList = z51Var.f473256d;
        if (linkedList != null) {
            for (r45.rz6 rz6Var : linkedList) {
                r45.xy6 xy6Var = rz6Var.f466863q;
                int i19 = xy6Var != null ? xy6Var.f472134f : 0;
                if (i19 < 0 || i19 <= 2008004) {
                    r45.b70 b70Var = rz6Var.f466856g;
                    if (b70Var != null) {
                        java.lang.String id6 = rz6Var.f466853d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(id6, "id");
                        java.lang.String title = b70Var.f452115d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(title, "title");
                        java.lang.String tmpl_desc_url = b70Var.f452120i;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmpl_desc_url, "tmpl_desc_url");
                        long j17 = b70Var.f452121m;
                        java.lang.String preview_covel_url = b70Var.f452118g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(preview_covel_url, "preview_covel_url");
                        r45.ol0 ol0Var = rz6Var.f466864r;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = rz6Var.f466867u;
                        boolean z17 = rz6Var.f466859m.f453947e == i18 ? i18 : 0;
                        r45.dv0 dv0Var = rz6Var.f466869w;
                        java.lang.String str = dv0Var != null ? dv0Var.f454300d : null;
                        java.lang.String str2 = str == null ? "" : str;
                        java.lang.String str3 = dv0Var != null ? dv0Var.f454301e : null;
                        java.lang.String str4 = str3 == null ? "" : str3;
                        r45.xs xsVar = rz6Var.f466857h;
                        int i27 = xsVar != null ? xsVar.f471900e : 0;
                        java.lang.String ai_model_type = rz6Var.f466868v;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ai_model_type, "ai_model_type");
                        boolean z18 = ai_model_type.length() > 0;
                        java.lang.String guide_wording = b70Var.F;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(guide_wording, "guide_wording");
                        pVar = new vt3.p(null, id6, title, tmpl_desc_url, j17, preview_covel_url, ol0Var, gVar, z17, str2, str4, i27, z18, guide_wording, b70Var.G, rz6Var.f466863q, b70Var, rz6Var.f466870x, 1, null);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetCameraTemplateGgi", "getFavTemplateListRep >> filtered id:" + rz6Var.f466853d + ", minSDKVersion:" + i19 + " currentSDKVersion:2008004");
                }
                if (pVar != null) {
                    arrayList.add(pVar);
                }
                i18 = 1;
                pVar = null;
            }
        }
        return new rt3.a(arrayList, z51Var.f473258f, z51Var.f473259g, z51Var.f473257e, null, null, true);
    }
}
