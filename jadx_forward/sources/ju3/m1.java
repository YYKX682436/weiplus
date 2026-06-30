package ju3;

/* loaded from: classes3.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17024x523c7ab4 f383507d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17024x523c7ab4 c17024x523c7ab4) {
        this.f383507d = c17024x523c7ab4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View m68023xe2ac4207;
        m68023xe2ac4207 = this.f383507d.m68023xe2ac4207();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m68023xe2ac4207, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout$loadCurrentPage$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m68023xe2ac4207.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m68023xe2ac4207, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout$loadCurrentPage$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
