package e80;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f331535d;

    /* renamed from: e, reason: collision with root package name */
    public int f331536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r70.g f331537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o70.l f331538g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f331539h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r70.g gVar, o70.l lVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f331537f = gVar;
        this.f331538g = lVar;
        this.f331539h = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e80.c(this.f331537f, this.f331538g, this.f331539h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e80.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long elapsedRealtime;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f331536e;
        r70.g gVar = this.f331537f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgAsyncSendFSC", "sendRawImgAsyncWithPreBuild[" + gVar.f474637f + "] imgPath:" + gVar.f474632a + " compressType:" + gVar.f474633b);
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            ((java.util.HashMap) gVar.f474640i).put("send_id", gVar.f474637f);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f474637f, gVar.f474638g)) {
                ((java.util.HashMap) gVar.f474640i).put("send_group_id", gVar.f474638g);
            }
            ((java.util.HashMap) gVar.f474640i).put("send_img_path", gVar.f474632a);
            ((java.util.HashMap) gVar.f474640i).put("send_img_length", new java.lang.Long(com.p314xaae8f345.mm.vfs.w6.k(gVar.f474632a)));
            ((java.util.HashMap) gVar.f474640i).put("send_inner_version", new java.lang.Integer(50));
            ((java.util.HashMap) gVar.f474640i).put("send_compress_type", new java.lang.Integer(gVar.f474633b));
            java.util.Map map = gVar.f474640i;
            java.lang.String username = gVar.f474634c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            if (r26.n0.B(username, "@", false)) {
                str = (java.lang.String) kz5.n0.a0(r26.n0.f0(username, new java.lang.String[]{"@"}, false, 0, 6, null), 1);
                if (str == null) {
                    str = "other.at";
                }
            } else {
                str = r26.i0.y(username, "gh_", false) ? "biz" : "normal";
            }
            ((java.util.HashMap) map).put("send_from_user_type", str);
            ((java.util.HashMap) gVar.f474640i).put("send_source", new java.lang.Integer(gVar.f474636e.f386175a));
            ((java.util.HashMap) gVar.f474640i).put("send_rotate", new java.lang.Integer(gVar.f474639h));
            o70.l lVar = this.f331538g;
            p70.b bVar = new p70.b(com.p314xaae8f345.mm.vfs.w6.j(lVar.f424803f) ? p70.c.f433999d : p70.c.f434004i);
            bVar.f433998b = lVar;
            e80.r a17 = e80.r.f331608f.a();
            this.f331535d = elapsedRealtime;
            this.f331536e = 1;
            obj = a17.b7(gVar, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            elapsedRealtime = this.f331535d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r70.h hVar = (r70.h) obj;
        ((java.util.HashMap) gVar.f474640i).put("send_result_type", hVar.f474642a.toString());
        ((java.util.HashMap) gVar.f474640i).put("send_total_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        if (hVar.f474642a != r70.i.f474647e) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(gVar.f474641j, gVar.f474640i, 32785);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgAsyncSendFSC", "report: " + gVar.f474641j + ' ' + gVar.f474640i);
        }
        this.f331536e = 2;
        if (this.f331539h.mo771x2f8fd3(hVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
