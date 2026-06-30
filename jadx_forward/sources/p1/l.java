package p1;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f432375a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.g f432376b;

    /* renamed from: c, reason: collision with root package name */
    public int f432377c;

    public l(java.util.List changes, p1.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changes, "changes");
        this.f432375a = changes;
        this.f432376b = gVar;
        android.view.MotionEvent motionEvent = gVar != null ? gVar.f432351b.f432437b : null;
        int i17 = 0;
        if (motionEvent != null) {
            motionEvent.getButtonState();
        }
        android.view.MotionEvent motionEvent2 = gVar != null ? gVar.f432351b.f432437b : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        android.view.MotionEvent motionEvent3 = gVar != null ? gVar.f432351b.f432437b : null;
        int i18 = 1;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i17 = 6;
                                break;
                            case 9:
                                i17 = 4;
                                break;
                            case 10:
                                i17 = 5;
                                break;
                        }
                        i18 = i17;
                    }
                    i17 = 3;
                    i18 = i17;
                }
                i17 = 2;
                i18 = i17;
            }
            i17 = 1;
            i18 = i17;
        } else {
            int size = changes.size();
            while (true) {
                if (i17 >= size) {
                    i18 = 3;
                    break;
                }
                p1.s sVar = (p1.s) changes.get(i17);
                if (p1.m.c(sVar)) {
                    i18 = 2;
                    break;
                } else if (p1.m.a(sVar)) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f432377c = i18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(java.util.List changes) {
        this(changes, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changes, "changes");
    }
}
