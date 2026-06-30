package g22;

/* loaded from: classes11.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b f349416d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b activityC13364x933d260b) {
        super(1);
        this.f349416d = activityC13364x933d260b;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b activityC13364x933d260b = this.f349416d;
        boolean containsKey = activityC13364x933d260b.f179973m.containsKey(java.lang.Integer.valueOf(intValue));
        java.util.HashMap hashMap = activityC13364x933d260b.f179973m;
        if (containsKey) {
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) hashMap.get(java.lang.Integer.valueOf(intValue));
            return abstractViewOnAttachStateChangeListenerC21400xb429b010 == null ? activityC13364x933d260b.T6(intValue) : abstractViewOnAttachStateChangeListenerC21400xb429b010;
        }
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 T6 = activityC13364x933d260b.T6(intValue);
        hashMap.put(java.lang.Integer.valueOf(intValue), T6);
        return T6;
    }
}
