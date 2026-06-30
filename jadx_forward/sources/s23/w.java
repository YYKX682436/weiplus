package s23;

/* loaded from: classes4.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f483871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f483872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s23.x f483873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.i2 f483874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f483875h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, s23.x xVar, r45.i2 i2Var, long j18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f483872e = j17;
        this.f483873f = xVar;
        this.f483874g = i2Var;
        this.f483875h = j18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new s23.w(this.f483872e, this.f483873f, this.f483874g, this.f483875h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((s23.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f483871d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f483871d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(this.f483872e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        s23.x xVar = this.f483873f;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo126862x19263085 = xVar.f483876d.mo126862x19263085();
        if ((mo126862x19263085.isFinishing() || mo126862x19263085.isDestroyed()) ? false : true) {
            r45.h2 h2Var = this.f483874g.f458205d;
            ((ez0.f) xVar.a()).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = ez0.f.f339324b;
            if (h2Var == null) {
                java.lang.String v17 = gm0.j1.u().c().v(u3Var, "");
                r45.h2 h2Var2 = new r45.h2();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
                jy0.b.a(h2Var2, v17);
                h2Var = h2Var2;
            }
            java.util.LinkedList models = h2Var.f457303d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(models, "models");
            java.util.ListIterator listIterator = models.listIterator(models.size());
            while (true) {
                boolean hasPrevious = listIterator.hasPrevious();
                j17 = this.f483875h;
                if (!hasPrevious) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (((r45.g2) obj2).f456364d == j17) {
                    break;
                }
            }
            r45.g2 g2Var = (r45.g2) obj2;
            java.util.LinkedList linkedList = h2Var.f457303d;
            if (g2Var == null) {
                g2Var = new r45.g2();
                g2Var.f456364d = j17;
                linkedList.add(g2Var);
            }
            long c17 = c01.id.c();
            java.util.LinkedList linkedList2 = g2Var.f456365e;
            if (linkedList2 != null) {
                linkedList2.add(java.lang.Long.valueOf(c17));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                n51.f.f416647a.d(jSONObject, "models", linkedList, false);
            } catch (java.lang.Exception unused) {
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            gm0.j1.u().c().x(u3Var, jSONObject2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasActivityTemplateTipServiceImpl", "markShowActivityTemplateTip: type=" + j17 + ", nowTime=" + c17);
            ((ez0.f) xVar.a()).a(uy0.n.f513435e);
        }
        return jz5.f0.f384359a;
    }
}
