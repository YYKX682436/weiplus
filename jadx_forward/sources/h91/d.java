package h91;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1043xd1075a44.C11804x96d4584a f361220d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1043xd1075a44.C11804x96d4584a c11804x96d4584a) {
        this.f361220d = c11804x96d4584a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1043xd1075a44.C11804x96d4584a c11804x96d4584a = this.f361220d;
        android.view.ViewParent parent = c11804x96d4584a.getParent();
        do {
            ((android.view.View) parent).forceLayout();
            parent = parent.getParent();
        } while (parent instanceof android.view.View);
        if (parent != null) {
            parent.requestLayout();
            c11804x96d4584a.invalidate();
        }
    }
}
