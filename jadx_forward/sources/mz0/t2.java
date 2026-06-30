package mz0;

/* loaded from: classes5.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f414596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.x2 f414598f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(az0.b0 b0Var, java.lang.String str, mz0.x2 x2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414596d = b0Var;
        this.f414597e = str;
        this.f414598f = x2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mz0.t2(this.f414596d, this.f414597e, this.f414598f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mz0.t2 t2Var = (mz0.t2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        t2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object obj2;
        n0.e5 e5Var;
        n0.e5 e5Var2;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356;
        java.lang.String m33856x92013dca;
        n0.e5 e5Var3;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("performPostAsync: templateId:");
        az0.b0 b0Var = this.f414596d;
        sb6.append(b0Var.f96873c);
        sb6.append(", workId=");
        java.lang.String str2 = this.f414597e;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", sb6.toString());
        mz0.x2 x2Var = this.f414598f;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = x2Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        dx1.g.f326022a.i("SnsTemplate", "installMiaojian", java.lang.Integer.valueOf(dw3.c.f325714a.b(context, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF") ? 1 : 2));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = x2Var.m158354x19263085();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_export_video_path", b0Var.f96871a);
        intent.putExtra("key_export_video_cover_path", b0Var.f96872b);
        intent.putExtra("key_export_background_task_id", str2);
        x2Var.getClass();
        r45.ib6 ib6Var = new r45.ib6();
        ib6Var.f458442d = "miaojian";
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = x2Var.o7().f151633r;
        java.lang.String str3 = "";
        if (m5Var == null || (str = m5Var.f151610a) == null) {
            str = "";
        }
        ib6Var.f458443e = str;
        java.lang.String str4 = b0Var.f96877g;
        if (str4 == null) {
            str4 = "";
        }
        ib6Var.f458447i = str4;
        java.lang.String str5 = b0Var.f96878h;
        if (str5 == null) {
            str5 = "";
        }
        ib6Var.f458448m = str5;
        java.util.Iterator it = x2Var.o7().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj2).f151610a, x2Var.o7().a())) {
                break;
            }
        }
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var2 = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj2;
        java.lang.Integer valueOf = m5Var2 != null ? java.lang.Integer.valueOf(x2Var.o7().b().indexOf(m5Var2)) : null;
        dx1.f fVar = dx1.g.f326022a;
        int i17 = 0;
        fVar.i("SnsPublishProcess", "egLocation", java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
        java.lang.String templateId = ib6Var.f458443e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(templateId, "templateId");
        fVar.i("SnsPublishProcess", "egID", templateId);
        ty0.b1 b1Var = x2Var.f414422m;
        if ((b1Var == null || (e5Var3 = b1Var.f504327d) == null || ((java.lang.Boolean) e5Var3.mo128745x754a37bb()).booleanValue()) ? false : true) {
            ty0.b1 b1Var2 = x2Var.f414422m;
            if (b1Var2 != null && (e5Var2 = b1Var2.f504325b) != null && (c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) e5Var2.mo128745x754a37bb()) != null && (m33856x92013dca = c4116xf4b2c356.m33856x92013dca()) != null) {
                str3 = m33856x92013dca;
            }
            ib6Var.f458444f = str3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "fillSnsVideoTemplate has music id " + ib6Var.f458444f);
            java.lang.String musicId = ib6Var.f458444f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(musicId, "musicId");
            fVar.i("SnsPublishProcess", "musicID", musicId);
        }
        ty0.b1 b1Var3 = x2Var.f414422m;
        if (b1Var3 != null && (e5Var = b1Var3.f504328e) != null && ((java.lang.Boolean) e5Var.mo128745x754a37bb()).booleanValue()) {
            i17 = 1;
        }
        fVar.i("SnsPublishProcess", "ifVoice", java.lang.Integer.valueOf(i17 ^ 1));
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5 k5Var = m5Var instanceof com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5 ? (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5) m5Var : null;
        if (k5Var != null) {
            ib6Var.f458446h = k5Var.f151563g;
            ib6Var.f458445g = k5Var.f151564h;
        }
        intent.putExtra("key_video_template_info", ib6Var.mo14344x5f01b1f6());
        intent.putExtra("key_edit_video_bgm_listen_id", b0Var.f96875e);
        intent.putExtra("key_edit_video_bgm_is_major_owned", b0Var.f96876f);
        m158354x19263085.setResult(-1, intent);
        m158354x19263085.finish();
        return jz5.f0.f384359a;
    }
}
