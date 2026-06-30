package a12;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a12.s f82055e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, a12.s sVar) {
        super(1);
        this.f82054d = str;
        this.f82055e = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        if (view instanceof com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d) {
            com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d) view;
            android.content.Context context = c10867x3e50a04d.getContext();
            a12.s sVar = this.f82055e;
            java.lang.String str = this.f82054d;
            c10867x3e50a04d.m46614x1f3ad8f5().put(str, new a12.p(new android.view.GestureDetector(context, new a12.q(sVar, str))));
        }
        return jz5.f0.f384359a;
    }
}
