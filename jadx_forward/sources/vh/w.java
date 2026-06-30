package vh;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh.y f518357d;

    public w(vh.y yVar) {
        this.f518357d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        vh.y yVar = this.f518357d;
        int size = ((java.util.ArrayList) yVar.f518358a.f518352d).size();
        ((java.util.ArrayList) yVar.f518358a.f518352d).clear();
        yVar.f518358a.m8154xdb81fc7f(0, size);
    }
}
