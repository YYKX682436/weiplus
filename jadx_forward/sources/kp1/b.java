package kp1;

/* loaded from: classes3.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(yz5.a task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            pm0.v.L("MicroMsg.AudioPanelTaskBarBaseView", true, new kp1.a(task));
        } else {
            task.mo152xb9724478();
        }
    }
}
