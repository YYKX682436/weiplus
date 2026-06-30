package nl;

/* loaded from: classes10.dex */
public class d {

    /* renamed from: j, reason: collision with root package name */
    public static int f419670j = 18432;

    /* renamed from: a, reason: collision with root package name */
    public int f419671a;

    /* renamed from: b, reason: collision with root package name */
    public int f419672b;

    /* renamed from: c, reason: collision with root package name */
    public int f419673c;

    /* renamed from: d, reason: collision with root package name */
    public int f419674d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f419675e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f419676f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f419677g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f419678h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public nl.g f419679i;

    public d() {
        nl.c cVar = new nl.c();
        this.f419679i = cVar;
        if (cVar.f419669a == null) {
            cVar.f419669a = new nl.h();
        }
    }

    public byte[] a(java.util.List list) {
        java.lang.Object obj;
        kl.k kVar;
        int i17;
        byte[] bArr;
        int i18;
        int i19;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = list.size() > 1;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            hl.e eVar = (hl.e) it.next();
            if (eVar == null || eVar.f363571f == null || android.text.TextUtils.isEmpty(eVar.f363566a)) {
                int i27 = rl.b.f478676a;
                obj = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioSyncMixController", "track or pcmData is null, or audioId is empty", null);
            } else {
                java.util.HashMap hashMap = this.f419676f;
                if (hashMap.containsKey(eVar.f363566a)) {
                    kVar = (kl.k) hashMap.get(eVar.f363566a);
                } else {
                    kl.i iVar = new kl.i(eVar.f363566a, eVar.f363567b, eVar.f363568c, eVar.f363569d, this.f419671a, this.f419672b, this.f419673c);
                    hashMap.put(eVar.f363566a, iVar);
                    kVar = iVar;
                }
                hl.e eVar2 = new hl.e();
                byte[] a17 = kVar.a(eVar.f363571f);
                eVar2.f363571f = a17;
                java.lang.String str = eVar.f363566a;
                eVar2.f363566a = str;
                eVar2.f363570e = eVar.f363570e;
                eVar2.f363568c = eVar.f363568c;
                eVar2.f363567b = eVar.f363567b;
                eVar2.f363569d = eVar.f363569d;
                if (z17 && a17 != null && a17.length != 0) {
                    java.util.HashMap hashMap2 = this.f419677g;
                    boolean containsKey = hashMap2.containsKey(str);
                    java.util.HashMap hashMap3 = this.f419678h;
                    if (containsKey) {
                        bArr = (byte[]) hashMap2.get(eVar2.f363566a);
                        i17 = ((java.lang.Integer) hashMap3.get(eVar2.f363566a)).intValue();
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    if (i17 <= 0 || bArr == null) {
                        int length = a17.length;
                        int i28 = this.f419674d;
                        if (length < i28) {
                            byte[] bArr2 = new byte[i28];
                            java.util.Arrays.fill(bArr2, 0, i28, (byte) 0);
                            java.lang.System.arraycopy(a17, 0, bArr2, 0, a17.length);
                            eVar2.f363571f = bArr2;
                        } else if (a17.length > i28) {
                            byte[] bArr3 = new byte[i28];
                            java.util.Arrays.fill(bArr3, 0, i28, (byte) 0);
                            java.lang.System.arraycopy(a17, 0, bArr3, 0, this.f419674d);
                            eVar2.f363571f = bArr3;
                            if (bArr == null) {
                                int length2 = a17.length;
                                int i29 = f419670j;
                                if (length2 > i29) {
                                    i29 = a17.length;
                                }
                                f419670j = i29;
                                bArr = new byte[i29];
                            }
                            java.util.Arrays.fill(bArr, 0, f419670j, (byte) 0);
                            int i37 = this.f419674d;
                            java.lang.System.arraycopy(a17, i37, bArr, 0, a17.length - i37);
                            hashMap3.put(eVar2.f363566a, java.lang.Integer.valueOf(a17.length - this.f419674d));
                            hashMap2.put(eVar2.f363566a, bArr);
                        }
                    } else {
                        int length3 = a17.length;
                        int i38 = f419670j - i17;
                        if (length3 <= i38) {
                            java.lang.System.arraycopy(a17, 0, bArr, i17, a17.length);
                            i18 = a17.length;
                        } else {
                            java.lang.System.arraycopy(a17, 0, bArr, i17, i38);
                            i18 = f419670j - i17;
                        }
                        int i39 = i17 + i18;
                        int i47 = this.f419674d;
                        if (i39 > i47) {
                            i19 = i39 - i47;
                            byte[] bArr4 = new byte[i47];
                            java.lang.System.arraycopy(bArr, 0, bArr4, 0, i47);
                            eVar2.f363571f = bArr4;
                            byte[] bArr5 = new byte[i19];
                            java.lang.System.arraycopy(bArr, this.f419674d, bArr5, 0, i19);
                            java.util.Arrays.fill(bArr, 0, f419670j, (byte) 0);
                            java.lang.System.arraycopy(bArr5, 0, bArr, 0, i19);
                        } else {
                            byte[] bArr6 = new byte[i47];
                            java.lang.System.arraycopy(bArr, 0, bArr6, 0, i39);
                            eVar2.f363571f = bArr6;
                            java.util.Arrays.fill(bArr, 0, f419670j, (byte) 0);
                            i19 = 0;
                        }
                        hashMap3.put(eVar2.f363566a, java.lang.Integer.valueOf(i19));
                        hashMap2.put(eVar2.f363566a, bArr);
                    }
                }
                if (eVar2.f363571f.equals(eVar.f363571f)) {
                    byte[] bArr7 = eVar2.f363571f;
                    byte[] bArr8 = new byte[bArr7.length];
                    java.lang.System.arraycopy(bArr7, 0, bArr8, 0, bArr7.length);
                    eVar2.f363571f = bArr8;
                }
                eVar = eVar2;
                obj = null;
            }
            arrayList.add(eVar);
        }
        return b(arrayList);
    }

    public final byte[] b(java.util.List list) {
        if (list == null || list.isEmpty()) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioSyncMixController", "list is invalid", null);
            return null;
        }
        if (list.size() == 1) {
            return ((hl.e) list.get(0)).f363571f;
        }
        nl.g gVar = this.f419679i;
        if (gVar == null) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioSyncMixController", "mixer is null", null);
            return null;
        }
        hl.b a17 = ((nl.c) gVar).a(list);
        if (a17 != null) {
            return a17.f363549c;
        }
        return null;
    }
}
