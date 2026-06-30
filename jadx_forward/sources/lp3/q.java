package lp3;

/* loaded from: classes5.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp3.r f401836d;

    public q(lp3.r rVar) {
        this.f401836d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        lp3.r rVar = this.f401836d;
        if (rVar.Ai() != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            rVar.m134976x2690a4ac();
            for (int i17 = 0; i17 < 100 && i17 < rVar.f401839f.size(); i17++) {
                linkedList.add((r45.m55) rVar.f401839f.get(i17));
            }
            rVar.f401838e.c(linkedList);
        }
    }
}
