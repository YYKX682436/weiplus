package db5;

/* loaded from: classes8.dex */
public class e9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be f309863e;

    public e9(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be c21532x4955f5be, java.lang.String str) {
        this.f309863e = c21532x4955f5be;
        this.f309862d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/TalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be c21532x4955f5be = this.f309863e;
        c21532x4955f5be.k(300L);
        db5.i9 i9Var = c21532x4955f5be.f279220d;
        if (i9Var != null) {
            i9Var.a(this.f309862d);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/TalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
