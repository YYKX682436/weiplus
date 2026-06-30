package dr;

/* loaded from: classes12.dex */
public abstract class t extends dr.s {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f323935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, android.view.View view) {
        super(emojiInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f323935c = new java.lang.ref.WeakReference(view);
        dr.s sVar = (dr.s) view.getTag(com.p314xaae8f345.mm.R.id.dbt);
        if (sVar != null) {
            sVar.a();
        }
        view.setTag(com.p314xaae8f345.mm.R.id.dbt, this);
    }

    @Override // dr.s
    public void a() {
        super.a();
        java.lang.ref.WeakReference weakReference = this.f323935c;
        android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view != null) {
            view.setTag(com.p314xaae8f345.mm.R.id.dbt, null);
        }
        this.f323935c = null;
    }
}
