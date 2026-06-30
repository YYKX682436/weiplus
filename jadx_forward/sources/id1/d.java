package id1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final id1.b f371992h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f371993i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f371994m;

    /* renamed from: n, reason: collision with root package name */
    public static final id1.d f371995n;

    /* renamed from: o, reason: collision with root package name */
    public static final id1.d f371996o;

    /* renamed from: p, reason: collision with root package name */
    public static final id1.d f371997p;

    /* renamed from: q, reason: collision with root package name */
    public static final id1.d f371998q;

    /* renamed from: r, reason: collision with root package name */
    public static final id1.d f371999r;

    /* renamed from: s, reason: collision with root package name */
    public static final id1.d f372000s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ id1.d[] f372001t;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f372002d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f372003e;

    /* renamed from: f, reason: collision with root package name */
    public final hd1.e f372004f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.ArrayMap f372005g = new android.util.ArrayMap();

    static {
        id1.d dVar = new id1.d("NFC_A", 0, "NFC-A", android.nfc.tech.NfcA.class.getName(), hd1.b0.f361924a);
        f371995n = dVar;
        id1.d dVar2 = new id1.d("NFC_B", 1, "NFC-B", android.nfc.tech.NfcB.class.getName(), null);
        f371996o = dVar2;
        id1.d dVar3 = new id1.d("ISO_DEP", 2, "ISO-DEP", android.nfc.tech.IsoDep.class.getName(), hd1.f.f361931a);
        f371997p = dVar3;
        id1.d dVar4 = new id1.d("NFC_F", 3, "NFC-F", android.nfc.tech.NfcF.class.getName(), null);
        f371998q = dVar4;
        id1.d dVar5 = new id1.d("NFC_V", 4, "NFC-V", android.nfc.tech.NfcV.class.getName(), null);
        f371999r = dVar5;
        id1.d dVar6 = new id1.d("MIFARE_CLASSIC", 5, "MIFARE Classic", android.nfc.tech.MifareClassic.class.getName(), null);
        id1.d dVar7 = new id1.d("MIFARE_ULTRALIGHT", 6, "MIFARE Ultralight", android.nfc.tech.MifareUltralight.class.getName(), null);
        id1.d dVar8 = new id1.d("NDEF", 7, "NDEF", android.nfc.tech.Ndef.class.getName(), null);
        f372000s = dVar8;
        id1.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8};
        f372001t = dVarArr;
        rz5.b.a(dVarArr);
        f371992h = new id1.b(null);
        id1.d[] m135110xcee59d22 = m135110xcee59d22();
        java.util.ArrayList arrayList = new java.util.ArrayList(m135110xcee59d22.length);
        for (id1.d dVar9 : m135110xcee59d22) {
            arrayList.add(new jz5.l(dVar9.f372002d, dVar9));
        }
        f371993i = kz5.c1.q(arrayList);
        id1.d[] m135110xcee59d222 = m135110xcee59d22();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(m135110xcee59d222.length);
        for (id1.d dVar10 : m135110xcee59d222) {
            arrayList2.add(new jz5.l(dVar10.f372003e, dVar10.f372002d));
        }
        f371994m = kz5.c1.q(arrayList2);
    }

    public d(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, hd1.e eVar) {
        this.f372002d = str2;
        this.f372003e = str3;
        this.f372004f = eVar;
    }

    /* renamed from: valueOf */
    public static id1.d m135109xdce0328(java.lang.String str) {
        return (id1.d) java.lang.Enum.valueOf(id1.d.class, str);
    }

    /* renamed from: values */
    public static id1.d[] m135110xcee59d22() {
        return (id1.d[]) f372001t.clone();
    }
}
