package lw2;

/* loaded from: classes2.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw2.m f403107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(lw2.m mVar) {
        super(0);
        this.f403107d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewParent parent;
        android.view.ViewParent parent2;
        android.view.ViewParent parent3 = this.f403107d.f403109a.getParent();
        android.view.ViewParent parent4 = (parent3 == null || (parent = parent3.getParent()) == null || (parent2 = parent.getParent()) == null) ? null : parent2.getParent();
        if (parent4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952) parent4;
        }
        return null;
    }
}
