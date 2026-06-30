package androidx.camera.core.impl;

/* loaded from: classes13.dex */
public class Quirks {
    private final java.util.List<androidx.camera.core.impl.Quirk> mQuirks;

    public Quirks(java.util.List<androidx.camera.core.impl.Quirk> list) {
        this.mQuirks = new java.util.ArrayList(list);
    }

    public static java.lang.String toString(androidx.camera.core.impl.Quirks quirks) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.Quirk> it = quirks.mQuirks.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClass().getSimpleName());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it6 = arrayList.iterator();
        if (it6.hasNext()) {
            while (true) {
                sb6.append((java.lang.CharSequence) it6.next());
                if (!it6.hasNext()) {
                    break;
                }
                sb6.append((java.lang.CharSequence) com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
            }
        }
        return sb6.toString();
    }

    public void addQuirkForTesting(androidx.camera.core.impl.Quirk quirk) {
        this.mQuirks.add(quirk);
    }

    public boolean contains(java.lang.Class<? extends androidx.camera.core.impl.Quirk> cls) {
        java.util.Iterator<androidx.camera.core.impl.Quirk> it = this.mQuirks.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends androidx.camera.core.impl.Quirk> T get(java.lang.Class<T> cls) {
        java.util.Iterator<androidx.camera.core.impl.Quirk> it = this.mQuirks.iterator();
        while (it.hasNext()) {
            T t17 = (T) it.next();
            if (t17.getClass() == cls) {
                return t17;
            }
        }
        return null;
    }

    public <T extends androidx.camera.core.impl.Quirk> java.util.List<T> getAll(java.lang.Class<T> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.impl.Quirk quirk : this.mQuirks) {
            if (cls.isAssignableFrom(quirk.getClass())) {
                arrayList.add(quirk);
            }
        }
        return arrayList;
    }
}
