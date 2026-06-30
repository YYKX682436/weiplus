package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public abstract class w4 {
    /* JADX WARN: Multi-variable type inference failed */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4 a(android.content.Context context) {
        android.content.Context baseContext;
        if (context == 0) {
            return null;
        }
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4) context;
        }
        if (!(context instanceof android.content.ContextWrapper) || (baseContext = ((android.content.ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return a(baseContext);
    }
}
