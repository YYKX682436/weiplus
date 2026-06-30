package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes12.dex */
public class v0 extends android.database.Observable {
    public void a() {
        for (int size = ((android.database.Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.w0) ((android.database.Observable) this).mObservers.get(size)).a();
        }
    }

    public void b(int i17, int i18) {
        for (int size = ((android.database.Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.w0) ((android.database.Observable) this).mObservers.get(size)).b(i17, i18);
        }
    }
}
