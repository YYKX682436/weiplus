package r36;

/* loaded from: classes16.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final r36.c[] f450921a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f450922b;

    static {
        r36.c cVar = new r36.c(r36.c.f450886i, "");
        x36.o oVar = r36.c.f450883f;
        r36.c cVar2 = new r36.c(oVar, "GET");
        r36.c cVar3 = new r36.c(oVar, "POST");
        x36.o oVar2 = r36.c.f450884g;
        r36.c cVar4 = new r36.c(oVar2, "/");
        r36.c cVar5 = new r36.c(oVar2, "/index.html");
        x36.o oVar3 = r36.c.f450885h;
        r36.c cVar6 = new r36.c(oVar3, "http");
        r36.c cVar7 = new r36.c(oVar3, "https");
        x36.o oVar4 = r36.c.f450882e;
        r36.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new r36.c(oVar4, "200"), new r36.c(oVar4, "204"), new r36.c(oVar4, "206"), new r36.c(oVar4, "304"), new r36.c(oVar4, "400"), new r36.c(oVar4, "404"), new r36.c(oVar4, "500"), new r36.c("accept-charset", ""), new r36.c("accept-encoding", "gzip, deflate"), new r36.c("accept-language", ""), new r36.c("accept-ranges", ""), new r36.c("accept", ""), new r36.c("access-control-allow-origin", ""), new r36.c("age", ""), new r36.c("allow", ""), new r36.c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49301xf1b4e78f, ""), new r36.c("cache-control", ""), new r36.c("content-disposition", ""), new r36.c("content-encoding", ""), new r36.c("content-language", ""), new r36.c("content-length", ""), new r36.c("content-location", ""), new r36.c("content-range", ""), new r36.c("content-type", ""), new r36.c("cookie", ""), new r36.c(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37645x68f5f8be, ""), new r36.c("etag", ""), new r36.c("expect", ""), new r36.c("expires", ""), new r36.c("from", ""), new r36.c("host", ""), new r36.c("if-match", ""), new r36.c("if-modified-since", ""), new r36.c("if-none-match", ""), new r36.c("if-range", ""), new r36.c("if-unmodified-since", ""), new r36.c("last-modified", ""), new r36.c("link", ""), new r36.c(ya.b.f77489x9ff58fb5, ""), new r36.c("max-forwards", ""), new r36.c("proxy-authenticate", ""), new r36.c("proxy-authorization", ""), new r36.c("range", ""), new r36.c("referer", ""), new r36.c("refresh", ""), new r36.c("retry-after", ""), new r36.c("server", ""), new r36.c("set-cookie", ""), new r36.c("strict-transport-security", ""), new r36.c("transfer-encoding", ""), new r36.c("user-agent", ""), new r36.c("vary", ""), new r36.c(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56308x97129f1f, ""), new r36.c("www-authenticate", "")};
        f450921a = cVarArr;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(cVarArr.length);
        for (int i17 = 0; i17 < cVarArr.length; i17++) {
            if (!linkedHashMap.containsKey(cVarArr[i17].f450887a)) {
                linkedHashMap.put(cVarArr[i17].f450887a, java.lang.Integer.valueOf(i17));
            }
        }
        f450922b = java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    public static x36.o a(x36.o oVar) {
        int l17 = oVar.l();
        for (int i17 = 0; i17 < l17; i17++) {
            byte o17 = oVar.o(i17);
            if (o17 >= 65 && o17 <= 90) {
                throw new java.io.IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(oVar.u()));
            }
        }
        return oVar;
    }
}
