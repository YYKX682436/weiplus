package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f79544d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f79545e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f79546f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f79547g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f79548h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f79549i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f79550m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f79551n;

    /* renamed from: o, reason: collision with root package name */
    public int f79552o;

    /* renamed from: p, reason: collision with root package name */
    public int f79553p;

    /* renamed from: q, reason: collision with root package name */
    public int f79554q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79555r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f79556s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.o1 f79557t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f79558u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.o f79559v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ java.util.List f79560w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f79561x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.auth.o1 o1Var, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar, java.util.List list, org.json.JSONObject jSONObject2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f79555r = yVar;
        this.f79556s = i17;
        this.f79557t = o1Var;
        this.f79558u = jSONObject;
        this.f79559v = oVar;
        this.f79560w = list;
        this.f79561x = jSONObject2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.g1(this.f79555r, this.f79556s, this.f79557t, this.f79558u, this.f79559v, this.f79560w, this.f79561x, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.auth.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0318 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0211 A[Catch: all -> 0x05bb, TryCatch #19 {all -> 0x05bb, blocks: (B:16:0x0051, B:19:0x0366, B:56:0x007b, B:123:0x0318, B:94:0x033c, B:96:0x0344, B:98:0x0348, B:129:0x00b4, B:136:0x0279, B:145:0x02f9, B:157:0x00c7, B:159:0x01e2, B:167:0x01fb, B:169:0x0201, B:175:0x0215, B:176:0x0211, B:178:0x0228, B:179:0x023a, B:184:0x00e6, B:186:0x017a, B:187:0x017c, B:189:0x0180, B:223:0x0191, B:225:0x0199, B:227:0x019d, B:232:0x01aa, B:236:0x01c7, B:275:0x00f8, B:278:0x0101, B:281:0x0105, B:284:0x0109, B:287:0x0143, B:288:0x0147, B:291:0x014e, B:293:0x0151, B:295:0x0174), top: B:2:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023a A[Catch: all -> 0x05bb, TRY_LEAVE, TryCatch #19 {all -> 0x05bb, blocks: (B:16:0x0051, B:19:0x0366, B:56:0x007b, B:123:0x0318, B:94:0x033c, B:96:0x0344, B:98:0x0348, B:129:0x00b4, B:136:0x0279, B:145:0x02f9, B:157:0x00c7, B:159:0x01e2, B:167:0x01fb, B:169:0x0201, B:175:0x0215, B:176:0x0211, B:178:0x0228, B:179:0x023a, B:184:0x00e6, B:186:0x017a, B:187:0x017c, B:189:0x0180, B:223:0x0191, B:225:0x0199, B:227:0x019d, B:232:0x01aa, B:236:0x01c7, B:275:0x00f8, B:278:0x0101, B:281:0x0105, B:284:0x0109, B:287:0x0143, B:288:0x0147, B:291:0x014e, B:293:0x0151, B:295:0x0174), top: B:2:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01aa A[Catch: all -> 0x05bb, TRY_LEAVE, TryCatch #19 {all -> 0x05bb, blocks: (B:16:0x0051, B:19:0x0366, B:56:0x007b, B:123:0x0318, B:94:0x033c, B:96:0x0344, B:98:0x0348, B:129:0x00b4, B:136:0x0279, B:145:0x02f9, B:157:0x00c7, B:159:0x01e2, B:167:0x01fb, B:169:0x0201, B:175:0x0215, B:176:0x0211, B:178:0x0228, B:179:0x023a, B:184:0x00e6, B:186:0x017a, B:187:0x017c, B:189:0x0180, B:223:0x0191, B:225:0x0199, B:227:0x019d, B:232:0x01aa, B:236:0x01c7, B:275:0x00f8, B:278:0x0101, B:281:0x0105, B:284:0x0109, B:287:0x0143, B:288:0x0147, B:291:0x014e, B:293:0x0151, B:295:0x0174), top: B:2:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01c7 A[Catch: all -> 0x05bb, TRY_ENTER, TryCatch #19 {all -> 0x05bb, blocks: (B:16:0x0051, B:19:0x0366, B:56:0x007b, B:123:0x0318, B:94:0x033c, B:96:0x0344, B:98:0x0348, B:129:0x00b4, B:136:0x0279, B:145:0x02f9, B:157:0x00c7, B:159:0x01e2, B:167:0x01fb, B:169:0x0201, B:175:0x0215, B:176:0x0211, B:178:0x0228, B:179:0x023a, B:184:0x00e6, B:186:0x017a, B:187:0x017c, B:189:0x0180, B:223:0x0191, B:225:0x0199, B:227:0x019d, B:232:0x01aa, B:236:0x01c7, B:275:0x00f8, B:278:0x0101, B:281:0x0105, B:284:0x0109, B:287:0x0143, B:288:0x0147, B:291:0x014e, B:293:0x0151, B:295:0x0174), top: B:2:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05f2 A[Catch: all -> 0x0687, TryCatch #5 {all -> 0x0687, blocks: (B:52:0x04cb, B:193:0x04e1, B:195:0x04e7, B:199:0x04fc, B:201:0x0508, B:203:0x0512, B:205:0x0518, B:208:0x0522, B:209:0x053b, B:212:0x0542, B:216:0x052f, B:218:0x0550, B:220:0x0554, B:221:0x0564, B:222:0x050e, B:245:0x05c9, B:247:0x05f2, B:249:0x05f8, B:251:0x060b, B:253:0x0615, B:255:0x061b, B:258:0x0625, B:259:0x063e, B:262:0x0645, B:266:0x0632, B:268:0x064e, B:270:0x0652, B:271:0x0662, B:272:0x0611, B:273:0x0672), top: B:2:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0461 A[Catch: all -> 0x04d4, TryCatch #13 {all -> 0x04d4, blocks: (B:27:0x0438, B:29:0x0461, B:31:0x0467, B:33:0x0472, B:35:0x0478, B:38:0x0482, B:39:0x049b, B:42:0x04a2, B:47:0x048f, B:49:0x04af, B:65:0x03b0, B:67:0x03b4, B:69:0x03ba, B:74:0x03c8, B:75:0x03e1, B:78:0x03e9, B:83:0x03d5, B:85:0x03fc, B:108:0x0399), top: B:2:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03b4 A[Catch: p -> 0x040f, all -> 0x04d4, TryCatch #12 {p -> 0x040f, blocks: (B:65:0x03b0, B:67:0x03b4, B:69:0x03ba, B:74:0x03c8, B:75:0x03e1, B:78:0x03e9, B:83:0x03d5, B:85:0x03fc), top: B:64:0x03b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03c8 A[Catch: p -> 0x040f, all -> 0x04d4, TryCatch #12 {p -> 0x040f, blocks: (B:65:0x03b0, B:67:0x03b4, B:69:0x03ba, B:74:0x03c8, B:75:0x03e1, B:78:0x03e9, B:83:0x03d5, B:85:0x03fc), top: B:64:0x03b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03d5 A[Catch: p -> 0x040f, all -> 0x04d4, TryCatch #12 {p -> 0x040f, blocks: (B:65:0x03b0, B:67:0x03b4, B:69:0x03ba, B:74:0x03c8, B:75:0x03e1, B:78:0x03e9, B:83:0x03d5, B:85:0x03fc), top: B:64:0x03b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03fc A[Catch: p -> 0x040f, all -> 0x04d4, TRY_LEAVE, TryCatch #12 {p -> 0x040f, blocks: (B:65:0x03b0, B:67:0x03b4, B:69:0x03ba, B:74:0x03c8, B:75:0x03e1, B:78:0x03e9, B:83:0x03d5, B:85:0x03fc), top: B:64:0x03b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0332 A[Catch: all -> 0x0411, p -> 0x0418, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0411, blocks: (B:59:0x0312, B:89:0x0332, B:92:0x0338, B:134:0x0264, B:140:0x0290, B:143:0x02d3), top: B:133:0x0264 }] */
    /* JADX WARN: Type inference failed for: r0v7, types: [r45.h24] */
    /* JADX WARN: Type inference failed for: r10v0, types: [jc1.d] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Class<r45.h24>, java.lang.Object, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.lang.Object, com.tencent.mm.plugin.appbrand.jsapi.auth.o1] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v47, types: [com.tencent.mm.plugin.appbrand.jsapi.auth.n0] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v5, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3, types: [kotlinx.coroutines.r, kotlinx.coroutines.q] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.tencent.mm.plugin.appbrand.jsapi.auth.o] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v22, types: [km5.q] */
    /* JADX WARN: Type inference failed for: r4v26, types: [r45.h24] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.tencent.mm.plugin.appbrand.jsapi.auth.r] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v9, types: [com.tencent.mm.plugin.appbrand.jsapi.auth.q, km5.e] */
    /* JADX WARN: Type inference failed for: r8v13, types: [com.tencent.mm.plugin.appbrand.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.tencent.mm.plugin.appbrand.jsapi.l] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.auth.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
