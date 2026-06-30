package yi4;

/* loaded from: classes11.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi4.h f544142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24936x156de99 f544143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f544144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f544145g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yi4.h hVar, com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24936x156de99 c24936x156de99, boolean z17, yz5.l lVar) {
        super(2);
        this.f544142d = hVar;
        this.f544143e = c24936x156de99;
        this.f544144f = z17;
        this.f544145g = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.ArrayList<java.lang.String> arrayList;
        int intValue = ((java.lang.Number) obj).intValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.EnumC24938xf5832f70 m92342x7d1560c5 = this.f544143e.m92342x7d1560c5();
        this.f544142d.getClass();
        java.util.List list = kz5.p0.f395529d;
        yz5.l lVar = this.f544145g;
        if (intValue != -1 || intent == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleResult: cancelled, resultCode=");
            sb6.append(intValue);
            sb6.append(", hasData=");
            sb6.append(intent != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusPublishPlatformApiImpl", sb6.toString());
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (m92342x7d1560c5 == null) {
                m92342x7d1560c5 = com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.EnumC24938xf5832f70.f44669x8d50a669;
            }
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24937x2caca977(false, m92342x7d1560c5, list, list, false, 0L))));
        } else {
            int intExtra = intent.getIntExtra("Ktag_range_index", 0);
            java.lang.String stringExtra = intent.getStringExtra("Kother_user_name_list");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String str = stringExtra;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                list = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
            }
            if (this.f544144f) {
                arrayList = intent.getStringArrayListExtra("label_id");
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                }
            } else {
                arrayList = new java.util.ArrayList<>();
            }
            java.util.ArrayList<java.lang.String> arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Long j17 = r26.h0.j((java.lang.String) it.next());
                if (j17 != null) {
                    arrayList3.add(j17);
                }
            }
            try {
                bk4.q0.f103071a.a(intExtra, arrayList2, list);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusPublishPlatformApiImpl", "handleResult: checkSaveRecentRange failed, err=" + th6.getMessage());
            }
            long j18 = 0;
            try {
                java.util.Iterator<T> it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    j18 += ((b93.b) c93.a.a()).j((java.lang.String) it6.next()) != null ? r2.size() : 0;
                }
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusPublishPlatformApiImpl", "handleResult: getTagUserCount failed, err=" + th7.getMessage());
            }
            com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24937x2caca977 c24937x2caca977 = new com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24937x2caca977(true, intExtra != 1 ? intExtra != 2 ? intExtra != 3 ? com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.EnumC24938xf5832f70.f44669x8d50a669 : com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.EnumC24938xf5832f70.f44667xaa9f932d : com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.EnumC24938xf5832f70.f44670x397ad832 : com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.EnumC24938xf5832f70.f44668x180cb163, list, arrayList3, false, j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusPublishPlatformApiImpl", "handleResult: confirmed, privacy=" + c24937x2caca977.m92362x2b0e5f52() + ", contacts=" + list.size() + ", tags=" + arrayList3.size());
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c24937x2caca977)));
        }
        return jz5.f0.f384359a;
    }
}
