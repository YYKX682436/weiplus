package fn5;

/* loaded from: classes7.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f346177d;

    /* renamed from: e, reason: collision with root package name */
    public int f346178e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f346179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346180g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346181h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346180g = str;
        this.f346181h = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        fn5.c cVar = new fn5.c(this.f346180g, this.f346181h, interfaceC29045xdcb5ca57);
        cVar.f346179f = obj;
        return cVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn5.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.k] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.flow.k, java.lang.Object] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f440719d;
        ?? r27 = this.f346178e;
        java.lang.String str2 = this.f346181h;
        java.lang.String str3 = this.f346180g;
        java.lang.String str4 = "MicroMsg.ImageQueryGalleryViewModel";
        int i17 = 2;
        int i18 = 1;
        try {
        } catch (cl0.f unused) {
            str = "MicroMsg.ImageQueryGalleryViewModel";
        }
        if (r27 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f346179f;
            aq.r0 r0Var = aq.r0.f94473a;
            this.f346179f = kVar;
            this.f346178e = 1;
            g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new aq.v(str3, str2, null), this);
            r27 = kVar;
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (r27 != 1) {
                if (r27 != 2) {
                    if (r27 == 3) {
                        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                        return jz5.f0.f384359a;
                    }
                    if (r27 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar2 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f346179f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
            r27 = kVar2;
        }
        java.lang.String str5 = (java.lang.String) g17;
        int i19 = 0;
        if (str5 == null || str5.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryGalleryViewModel", "getImageKeywordPoint >> imagePath: " + str3 + ", keyword: " + str2 + ", result is null");
            jz5.l lVar = new jz5.l(str3, new java.util.ArrayList());
            this.f346179f = null;
            this.f346178e = 2;
            if (r27.mo771x2f8fd3(lVar, this) == aVar) {
                return aVar;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryGalleryViewModel", "getImageKeywordPoint >> imagePath: " + str3 + ", keyword: " + str2 + ", result: " + str5);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            cl0.e jSONArray = new cl0.g(str5).getJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            int mo15056xbe0e3ae6 = jSONArray.mo15056xbe0e3ae6();
            int i27 = 0;
            while (i27 < mo15056xbe0e3ae6) {
                cl0.e a17 = jSONArray.a(i27);
                cl0.e a18 = a17.a(i19);
                cl0.e a19 = a17.a(i17);
                str = str4;
                try {
                    i18 = 1;
                    arrayList.add(new android.graphics.RectF((float) a18.mo15051x160e9ec7(i19), (float) a18.mo15051x160e9ec7(i18), (float) a19.mo15051x160e9ec7(0), (float) a19.mo15051x160e9ec7(1)));
                    i27++;
                    mo15056xbe0e3ae6 = mo15056xbe0e3ae6;
                    str4 = str;
                    i17 = 2;
                    i19 = 0;
                } catch (cl0.f unused2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "parse json error");
                    jz5.l lVar2 = new jz5.l(str3, new java.util.ArrayList());
                    this.f346179f = null;
                    this.f346177d = null;
                    this.f346178e = 4;
                    if (r27.mo771x2f8fd3(lVar2, this) == aVar) {
                        return aVar;
                    }
                    return jz5.f0.f384359a;
                }
            }
            str = str4;
            jz5.l lVar3 = new jz5.l(str3, arrayList);
            this.f346179f = r27;
            this.f346177d = str3;
            this.f346178e = 3;
            if (r27.mo771x2f8fd3(lVar3, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
