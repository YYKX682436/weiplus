package k85;

/* loaded from: classes15.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21022xd1345258 f386978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f386979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21022xd1345258 activityC21022xd1345258, java.lang.String[] strArr) {
        super(1);
        this.f386978d = activityC21022xd1345258;
        this.f386979e = strArr;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String[] strArr = this.f386979e;
        com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21022xd1345258 activityC21022xd1345258 = this.f386978d;
        if (booleanValue) {
            activityC21022xd1345258.getIntent().putExtra("IS_FROM_DELEGATE", true);
            java.util.ArrayList arrayList = activityC21022xd1345258.f274728e;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j85.h.b(j85.h.f379791a, 151L, java.lang.Long.valueOf(((d85.g0) it.next()).f308726e), null, null, 12, null);
                }
            }
            z2.h.a(activityC21022xd1345258, strArr, activityC21022xd1345258.f274730g);
        } else {
            int length = strArr.length;
            int[] iArr = new int[length];
            for (int i17 = 0; i17 < length; i17++) {
                iArr[i17] = -1;
            }
            yz5.q qVar = com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21022xd1345258.f274726h;
            if (qVar != null) {
                qVar.mo147xb9724478(java.lang.Integer.valueOf(activityC21022xd1345258.f274730g), strArr, iArr);
            }
            yz5.q qVar2 = com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21022xd1345258.f274726h;
            if ((qVar2 != null ? qVar2.hashCode() : 0) == activityC21022xd1345258.f274727d) {
                com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21022xd1345258.f274726h = null;
            }
            activityC21022xd1345258.finish();
        }
        return jz5.f0.f384359a;
    }
}
