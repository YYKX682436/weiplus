package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes7.dex */
public final class s extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1102;
    public static final java.lang.String NAME = "consumeWCCoin";

    /* JADX WARN: Can't wrap try/catch for region: R(59:58|59|60|(1:62)(1:297)|(1:64)(1:296)|65|66|(6:67|68|69|(1:71)(1:291)|(2:286|287)(1:73)|74)|75|(6:76|77|78|(1:80)(1:282)|(2:277|278)(1:82)|83)|84|(6:85|86|87|(1:89)(1:273)|(2:268|269)(1:91)|92)|93|(6:94|95|96|(1:98)(1:264)|(2:259|260)(1:100)|101)|102|103|104|105|(1:107)(1:255)|(2:250|251)(1:109)|110|111|112|113|114|(1:116)(1:246)|(2:241|242)(1:118)|119|120|(6:121|122|123|(1:125)(1:237)|(2:232|233)(1:127)|128)|129|(4:130|131|132|(1:134)(1:228))|(27:223|224|137|138|139|140|(1:142)(1:219)|(20:214|215|145|(2:(1:185)(1:150)|(8:152|(1:154)(1:165)|(1:156)|157|158|159|160|161)(2:(1:169)|(8:171|(1:173)(1:184)|(1:175)|176|177|178|179|180)))|186|(1:188)|189|(1:191)(1:213)|192|(1:194)(1:212)|195|(1:197)(1:211)|198|(1:200)(1:210)|201|(1:203)(1:209)|204|(1:206)|207|208)|144|145|(0)|186|(0)|189|(0)(0)|192|(0)(0)|195|(0)(0)|198|(0)(0)|201|(0)(0)|204|(0)|207|208)|136|137|138|139|140|(0)(0)|(0)|144|145|(0)|186|(0)|189|(0)(0)|192|(0)(0)|195|(0)(0)|198|(0)(0)|201|(0)(0)|204|(0)|207|208) */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0236, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0237, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x022f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0175  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r26, org.json.JSONObject r27, int r28) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.wccoin.s.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }
}
