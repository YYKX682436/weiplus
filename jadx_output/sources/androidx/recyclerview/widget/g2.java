package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public class g2 extends android.database.Observable {
    public boolean a() {
        return !((android.database.Observable) this).mObservers.isEmpty();
    }

    public void b() {
        for (int size = ((android.database.Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((androidx.recyclerview.widget.h2) ((android.database.Observable) this).mObservers.get(size)).b();
        }
    }

    public void c(int i17, int i18) {
        for (int size = ((android.database.Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((androidx.recyclerview.widget.h2) ((android.database.Observable) this).mObservers.get(size)).f(i17, i18, 1);
        }
    }

    public void d(int i17, int i18, java.lang.Object obj) {
        for (int size = ((android.database.Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((androidx.recyclerview.widget.h2) ((android.database.Observable) this).mObservers.get(size)).d(i17, i18, obj);
        }
    }

    public void e(int i17, int i18) {
        for (int size = ((android.database.Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((androidx.recyclerview.widget.h2) ((android.database.Observable) this).mObservers.get(size)).e(i17, i18);
        }
    }

    public void f(int i17, int i18) {
        for (int size = ((android.database.Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((androidx.recyclerview.widget.h2) ((android.database.Observable) this).mObservers.get(size)).g(i17, i18);
        }
    }
}
