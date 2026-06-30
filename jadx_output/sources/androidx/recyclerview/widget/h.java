package androidx.recyclerview.widget;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.c0 f12056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.i f12057e;

    public h(androidx.recyclerview.widget.i iVar, androidx.recyclerview.widget.c0 c0Var) {
        this.f12057e = iVar;
        this.f12056d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.i iVar = this.f12057e;
        androidx.recyclerview.widget.k kVar = iVar.f12076g;
        if (kVar.f12106f == iVar.f12075f) {
            java.util.List list = iVar.f12074e;
            kVar.f12104d = list;
            kVar.f12105e = java.util.Collections.unmodifiableList(list);
            this.f12056d.a(kVar.f12101a);
        }
    }
}
