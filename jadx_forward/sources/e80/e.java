package e80;

/* loaded from: classes12.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f331545d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f331546e;

    /* renamed from: f, reason: collision with root package name */
    public int f331547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r70.g f331548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e80.f f331549h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f331550i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r70.g gVar, e80.f fVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f331548g = gVar;
        this.f331549h = fVar;
        this.f331550i = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e80.e(this.f331548g, this.f331549h, this.f331550i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e80.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        p70.a aVar;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f331547f;
        r70.g gVar = this.f331548g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendRawImgAsync[");
            sb6.append(gVar.f474637f);
            sb6.append("] imgPath:");
            java.lang.String str = gVar.f474632a;
            sb6.append(str);
            sb6.append(" compressType:");
            sb6.append(gVar.f474633b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgAsyncSendFSC", sb6.toString());
            e80.r.f331608f.a().V6(new r70.c(gVar, r70.d.f474616d));
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.util.Map map = gVar.f474640i;
            java.lang.String str2 = gVar.f474637f;
            ((java.util.HashMap) map).put("send_id", str2);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, gVar.f474638g)) {
                ((java.util.HashMap) map).put("send_group_id", gVar.f474638g);
            }
            ((java.util.HashMap) map).put("send_img_path", str);
            ((java.util.HashMap) map).put("send_img_length", new java.lang.Long(com.p314xaae8f345.mm.vfs.w6.k(str)));
            ((java.util.HashMap) map).put("send_inner_version", new java.lang.Integer(50));
            ((java.util.HashMap) map).put("send_compress_type", new java.lang.Integer(gVar.f474633b));
            com.p314xaae8f345.mm.p2621x8fb0427b.b4 b4Var = com.p314xaae8f345.mm.p2621x8fb0427b.c4.f275344a;
            ((java.util.HashMap) map).put("send_from_user_type", b4Var.a(gVar.f474634c));
            java.lang.String str3 = gVar.f474635d;
            ((java.util.HashMap) map).put("send_to_user_type", b4Var.a(str3));
            k70.i0 i0Var = gVar.f474636e;
            ((java.util.HashMap) map).put("send_source", new java.lang.Integer(i0Var.f386175a));
            ((java.util.HashMap) map).put("send_rotate", new java.lang.Integer(gVar.f474639h));
            p70.a aVar3 = new p70.a(str, gVar.f474633b, str3, i0Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            aVar3.f433993e = str2;
            aVar3.f433995g = null;
            aVar3.f433996h = i0Var.f386194t;
            c80.e a17 = c80.e.f121186f.a();
            this.f331546e = aVar3;
            this.f331545d = elapsedRealtime;
            this.f331547f = 1;
            java.lang.Object U6 = a17.U6(aVar3, this);
            if (U6 == aVar2) {
                return aVar2;
            }
            j17 = elapsedRealtime;
            aVar = aVar3;
            obj = U6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j18 = this.f331545d;
            aVar = (p70.a) this.f331546e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j17 = j18;
        }
        p70.b bVar = (p70.b) obj;
        ((java.util.HashMap) gVar.f474640i).putAll(aVar.f433994f);
        ((java.util.HashMap) gVar.f474640i).put("send_prepare_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - j17));
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) this.f331549h.f331551f).mo141623x754a37bb(), null, new e80.d(this.f331548g, bVar, j17, this.f331550i, null), 1, null);
        return jz5.f0.f384359a;
    }
}
