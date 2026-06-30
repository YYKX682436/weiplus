package dp3;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 f323741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f323742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9, android.content.Context context) {
        super(false);
        this.f323741d = c16774xbacd37e9;
        this.f323742e = context;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9 = this.f323741d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.C);
        android.content.Context context = this.f323742e;
        if (!K0) {
            linkedList2.add(0);
            linkedList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575112kt3));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.D)) {
            linkedList2.add(1);
            linkedList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575113kt4));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.N)) {
            linkedList2.add(2);
            linkedList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kt6));
        }
        if (linkedList2.size() == 1) {
            dp3.g.b(((java.lang.Integer) linkedList2.get(0)).intValue(), context, c16774xbacd37e9);
        } else {
            db5.e1.d(this.f323742e, null, linkedList, linkedList2, null, true, new dp3.d(this));
        }
    }
}
