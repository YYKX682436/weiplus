package androidx.preference;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.preference.x f11804a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f11805b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11806c = false;

    public d(androidx.preference.PreferenceGroup preferenceGroup, androidx.preference.x xVar) {
        this.f11804a = xVar;
        this.f11805b = preferenceGroup.f11747d;
    }

    public final java.util.List a(androidx.preference.PreferenceGroup preferenceGroup) {
        this.f11806c = false;
        boolean z17 = preferenceGroup.V != Integer.MAX_VALUE;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int O = preferenceGroup.O();
        int i17 = 0;
        for (int i18 = 0; i18 < O; i18++) {
            androidx.preference.Preference N = preferenceGroup.N(i18);
            if (N.C) {
                if (!z17 || i17 < preferenceGroup.V) {
                    arrayList.add(N);
                } else {
                    arrayList2.add(N);
                }
                if (N instanceof androidx.preference.PreferenceGroup) {
                    androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) N;
                    if (!(preferenceGroup2 instanceof androidx.preference.PreferenceScreen)) {
                        java.util.List<androidx.preference.Preference> a17 = a(preferenceGroup2);
                        if (z17 && this.f11806c) {
                            throw new java.lang.IllegalArgumentException("Nested expand buttons are not supported!");
                        }
                        for (androidx.preference.Preference preference : a17) {
                            if (!z17 || i17 < preferenceGroup.V) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i17++;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i17++;
                }
            }
        }
        if (z17 && i17 > preferenceGroup.V) {
            androidx.preference.c cVar = new androidx.preference.c(this.f11805b, arrayList2, preferenceGroup.f11749f);
            cVar.f11752i = new androidx.preference.b(this, preferenceGroup);
            arrayList.add(cVar);
        }
        this.f11806c |= z17;
        return arrayList;
    }
}
