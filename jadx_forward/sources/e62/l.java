package e62;

/* loaded from: classes4.dex */
public class l implements yj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e62.m f331306a;

    public l(e62.m mVar) {
        this.f331306a = mVar;
    }

    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        l52.f fVar;
        l52.f fVar2;
        l52.f fVar3;
        l52.f fVar4;
        l52.f fVar5;
        if (str.startsWith("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI") || str.startsWith("com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC")) {
            e62.m mVar = this.f331306a;
            if (mVar.f331309c == null) {
                return;
            }
            if (str4.equals("smoothScrollToPosition")) {
                if (objArr == null || objArr.length < 1) {
                    return;
                }
                e62.f fVar6 = mVar.f331309c;
                int intValue = ((java.lang.Integer) objArr[0]).intValue();
                e62.p pVar = (e62.p) fVar6;
                pVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, smoothScrollToPosition: %d", java.lang.Integer.valueOf(intValue));
                e62.q qVar = pVar.f331337a;
                e62.j b17 = qVar.b(qVar.f331339d);
                if (b17 == null || (fVar5 = b17.f331301d) == null) {
                    return;
                }
                fVar5.f398129p = intValue;
                return;
            }
            if (str4.equals("smoothScrollToPositionFromTop")) {
                if (objArr == null || objArr.length < 2) {
                    return;
                }
                e62.f fVar7 = mVar.f331309c;
                int intValue2 = ((java.lang.Integer) objArr[0]).intValue();
                ((java.lang.Integer) objArr[1]).intValue();
                e62.p pVar2 = (e62.p) fVar7;
                pVar2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, smoothScrollToPositionFromTop: %d", java.lang.Integer.valueOf(intValue2));
                e62.q qVar2 = pVar2.f331337a;
                e62.j b18 = qVar2.b(qVar2.f331339d);
                if (b18 == null || (fVar4 = b18.f331301d) == null) {
                    return;
                }
                fVar4.f398129p = intValue2;
                return;
            }
            if (str4.equals("scrollToTop")) {
                if (objArr == null || objArr.length < 1) {
                    return;
                }
                e62.f fVar8 = mVar.f331309c;
                e62.p pVar3 = (e62.p) fVar8;
                pVar3.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, scrollToTop...");
                e62.q qVar3 = pVar3.f331337a;
                e62.j b19 = qVar3.b(qVar3.f331339d);
                if (b19 == null || (fVar3 = b19.f331301d) == null) {
                    return;
                }
                fVar3.f398129p = 0;
                return;
            }
            if (str4.equals("scrollToPositionWithOffset")) {
                if (objArr == null || objArr.length < 1) {
                    return;
                }
                e62.f fVar9 = mVar.f331309c;
                int intValue3 = ((java.lang.Integer) objArr[0]).intValue();
                ((java.lang.Integer) objArr[1]).intValue();
                e62.p pVar4 = (e62.p) fVar9;
                pVar4.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, scrollToPositionWithOffset: %d", java.lang.Integer.valueOf(intValue3));
                e62.q qVar4 = pVar4.f331337a;
                e62.j b27 = qVar4.b(qVar4.f331339d);
                if (b27 == null || (fVar2 = b27.f331301d) == null) {
                    return;
                }
                fVar2.f398129p = intValue3;
                return;
            }
            if (!str4.equals("scrollToPosition") || objArr == null || objArr.length < 1) {
                return;
            }
            e62.f fVar10 = mVar.f331309c;
            int intValue4 = ((java.lang.Integer) objArr[0]).intValue();
            e62.p pVar5 = (e62.p) fVar10;
            pVar5.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, scrollToPosition: %d", java.lang.Integer.valueOf(intValue4));
            e62.q qVar5 = pVar5.f331337a;
            e62.j b28 = qVar5.b(qVar5.f331339d);
            if (b28 == null || (fVar = b28.f331301d) == null) {
                return;
            }
            fVar.f398129p = intValue4;
        }
    }
}
