package vy3;

/* loaded from: classes.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f523015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f523016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f523017f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        super(1);
        this.f523015d = hashMap;
        this.f523016e = kVar;
        this.f523017f = y2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11956x94aa59fc response = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11956x94aa59fc) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        kz5.n0.g0(response.f160241d, ",", null, null, 0, null, vy3.q.f523014d, 30, null);
        java.util.HashMap hashMap = this.f523015d;
        hashMap.put("retCode", 0);
        java.util.ArrayList arrayList = response.f160241d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7 c11954x6b9417d7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7) kz5.n0.a0(arrayList, 0);
        if (c11954x6b9417d7 == null || (str = c11954x6b9417d7.f160236d) == null) {
            str = "";
        }
        hashMap.put("province", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7 c11954x6b9417d72 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7) kz5.n0.a0(arrayList, 1);
        if (c11954x6b9417d72 == null || (str2 = c11954x6b9417d72.f160236d) == null) {
            str2 = "";
        }
        hashMap.put("city", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7 c11954x6b9417d73 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7) kz5.n0.a0(arrayList, 2);
        if (c11954x6b9417d73 == null || (str3 = c11954x6b9417d73.f160236d) == null) {
            str3 = "";
        }
        hashMap.put("district", str3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7 c11954x6b9417d74 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7) kz5.n0.a0(arrayList, 3);
        if (c11954x6b9417d74 == null || (str4 = c11954x6b9417d74.f160236d) == null) {
            str4 = "";
        }
        hashMap.put("street", str4);
        int size = arrayList.size() - 1;
        while (true) {
            if (-1 >= size) {
                str5 = null;
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7 c11954x6b9417d75 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7) kz5.n0.a0(arrayList, size);
            if (c11954x6b9417d75 != null) {
                str5 = java.lang.String.valueOf(c11954x6b9417d75.f160237e);
                break;
            }
            size--;
        }
        hashMap.put("nationalCode", str5 != null ? str5 : "");
        this.f523016e.f422396d.e(this.f523017f.f422546c, "showAddressPickerView:ok", hashMap);
        return jz5.f0.f384359a;
    }
}
