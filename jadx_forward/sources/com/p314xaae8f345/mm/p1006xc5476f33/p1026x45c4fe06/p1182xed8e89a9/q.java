package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9;

/* loaded from: classes7.dex */
public final class q implements qk.u6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.v f169236a;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.v vVar) {
        this.f169236a = vVar;
    }

    @Override // qk.u6
    public java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.v vVar = this.f169236a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = vVar.f169229e;
        if (e9Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e9Var);
            if (e9Var.mo32091x9a3f0ba2() != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = vVar.f169229e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e9Var2);
                sb6.append(cf.c.a(e9Var2).f158812e);
                sb6.append('-');
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var3 = vVar.f169229e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e9Var3);
                sb6.append(e9Var3.mo48798x74292566());
                return sb6.toString();
            }
        }
        return "小程序预调试环境(调试冷启动需先连接)-" + vVar.f169240o;
    }

    @Override // qk.u6
    public void b(java.lang.String str) {
        qk.v6 v6Var = (qk.v6) ((jz5.n) this.f169236a.f169241p).mo141623x754a37bb();
        if (v6Var != null) {
            ((xz1.k) v6Var).Di(this, str);
        }
    }

    @Override // qk.u6
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageProfileManagerWC", this + " onOpen");
    }

    @Override // qk.u6
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e;
        java.lang.Boolean bool;
        boolean z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.v vVar = this.f169236a;
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.e eVar = vVar.f169244s;
            if (eVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.u) eVar;
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.lang.String optString = jSONObject.optString(ya.b.f77491x8758c4e1, "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                if (r26.n0.B(optString, "HeapProfiler", false)) {
                    if (jSONObject.has(dm.i4.f66865x76d1ec5a)) {
                        uVar.f169239a.add(java.lang.Integer.valueOf(jSONObject.getInt(dm.i4.f66865x76d1ec5a)));
                    }
                    z17 = true;
                }
                bool = java.lang.Boolean.valueOf(z17);
            } else {
                bool = null;
            }
            z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE);
        }
        if (z17) {
            vVar.m(str);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        vVar.getClass();
        if (vVar.f169228d) {
            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "ProfileGlobal.onExternalInspectMessage('%s')", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = vVar.f169229e;
            if (e9Var == null || (f229341e = e9Var.getF229341e()) == null) {
                return;
            }
            f229341e.mo14660x738236e6(format, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.t(str));
        }
    }

    @Override // qk.u6
    /* renamed from: description */
    public java.lang.String mo52337x993583fc() {
        return a();
    }

    @Override // qk.u6
    /* renamed from: name */
    public java.lang.String mo52338x337a8b() {
        return "MiniProgramEnvironment-" + this.f169236a.f169240o;
    }

    @Override // qk.u6
    /* renamed from: onClose */
    public void mo52339xaf6bb359() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageProfileManagerWC", this + " onClose");
    }
}
