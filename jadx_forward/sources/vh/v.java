package vh;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f518355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh.y f518356e;

    public v(vh.y yVar, java.util.List list) {
        this.f518356e = yVar;
        this.f518355d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        vh.y yVar = this.f518356e;
        int size = ((java.util.ArrayList) yVar.f518358a.f518352d).size() - 1;
        java.util.List list = this.f518355d;
        int size2 = list.size();
        ((java.util.ArrayList) yVar.f518358a.f518352d).addAll(list);
        yVar.f518358a.m8151xc67946d3(java.lang.Math.max(size, 0), size2);
    }
}
