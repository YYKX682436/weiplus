package kk5;

/* loaded from: classes9.dex */
public final class f0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.h0 f390171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f390172e;

    public f0(kk5.h0 h0Var, java.util.LinkedList linkedList) {
        this.f390171d = h0Var;
        this.f390172e = linkedList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        kk5.h0 h0Var = this.f390171d;
        h0Var.getClass();
        java.util.LinkedList linkedList = this.f390172e;
        iz5.a.g(null, linkedList.size() > 0);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int size = linkedList.size();
        for (int i18 = 0; i18 < size; i18++) {
            linkedList2.add(3);
        }
        new r35.e4(h0Var.m158354x19263085(), kk5.g0.f390175a).f(linkedList, linkedList2, null);
    }
}
