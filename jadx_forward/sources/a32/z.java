package a32;

/* loaded from: classes8.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 f82583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82584e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5, int i17) {
        this.f82583d = c13394xa8c361b5;
        this.f82584e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5 = this.f82583d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c13394xa8c361b5.f180201f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        int i17 = this.f82584e;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$3$updateSelection$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$3$updateSelection$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5.b(c13394xa8c361b5, i17);
        c13394xa8c361b5.f180201f.post(new a32.y(c13394xa8c361b5));
    }
}
