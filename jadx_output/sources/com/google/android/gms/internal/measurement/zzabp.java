package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzbvl' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public class zzabp {
    public static final com.google.android.gms.internal.measurement.zzabp zzbvj;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvk;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvl;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvm;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvn;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvo;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvp;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvq;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvr;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvs;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvt;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvu;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvv;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvw;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvx;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvy;
    public static final com.google.android.gms.internal.measurement.zzabp zzbvz;
    public static final com.google.android.gms.internal.measurement.zzabp zzbwa;
    private static final /* synthetic */ com.google.android.gms.internal.measurement.zzabp[] zzbwd;
    private final com.google.android.gms.internal.measurement.zzabu zzbwb;
    private final int zzbwc;

    static {
        com.google.android.gms.internal.measurement.zzabp zzabpVar = new com.google.android.gms.internal.measurement.zzabp("DOUBLE", 0, com.google.android.gms.internal.measurement.zzabu.DOUBLE, 1);
        zzbvj = zzabpVar;
        com.google.android.gms.internal.measurement.zzabp zzabpVar2 = new com.google.android.gms.internal.measurement.zzabp("FLOAT", 1, com.google.android.gms.internal.measurement.zzabu.FLOAT, 5);
        zzbvk = zzabpVar2;
        com.google.android.gms.internal.measurement.zzabu zzabuVar = com.google.android.gms.internal.measurement.zzabu.LONG;
        final int i17 = 2;
        com.google.android.gms.internal.measurement.zzabp zzabpVar3 = new com.google.android.gms.internal.measurement.zzabp("INT64", 2, zzabuVar, 0);
        zzbvl = zzabpVar3;
        final int i18 = 3;
        com.google.android.gms.internal.measurement.zzabp zzabpVar4 = new com.google.android.gms.internal.measurement.zzabp("UINT64", 3, zzabuVar, 0);
        zzbvm = zzabpVar4;
        com.google.android.gms.internal.measurement.zzabu zzabuVar2 = com.google.android.gms.internal.measurement.zzabu.INT;
        com.google.android.gms.internal.measurement.zzabp zzabpVar5 = new com.google.android.gms.internal.measurement.zzabp("INT32", 4, zzabuVar2, 0);
        zzbvn = zzabpVar5;
        com.google.android.gms.internal.measurement.zzabp zzabpVar6 = new com.google.android.gms.internal.measurement.zzabp("FIXED64", 5, zzabuVar, 1);
        zzbvo = zzabpVar6;
        com.google.android.gms.internal.measurement.zzabp zzabpVar7 = new com.google.android.gms.internal.measurement.zzabp("FIXED32", 6, zzabuVar2, 5);
        zzbvp = zzabpVar7;
        com.google.android.gms.internal.measurement.zzabp zzabpVar8 = new com.google.android.gms.internal.measurement.zzabp("BOOL", 7, com.google.android.gms.internal.measurement.zzabu.BOOLEAN, 0);
        zzbvq = zzabpVar8;
        final com.google.android.gms.internal.measurement.zzabu zzabuVar3 = com.google.android.gms.internal.measurement.zzabu.STRING;
        final java.lang.String str = "STRING";
        final int i19 = 8;
        com.google.android.gms.internal.measurement.zzabp zzabpVar9 = new com.google.android.gms.internal.measurement.zzabp(str, i19, zzabuVar3, i17) { // from class: com.google.android.gms.internal.measurement.zzabq
            {
                int i27 = 8;
                int i28 = 2;
                com.google.android.gms.internal.measurement.zzabo zzaboVar = null;
            }
        };
        zzbvr = zzabpVar9;
        final com.google.android.gms.internal.measurement.zzabu zzabuVar4 = com.google.android.gms.internal.measurement.zzabu.MESSAGE;
        final java.lang.String str2 = "GROUP";
        final int i27 = 9;
        com.google.android.gms.internal.measurement.zzabp zzabpVar10 = new com.google.android.gms.internal.measurement.zzabp(str2, i27, zzabuVar4, i18) { // from class: com.google.android.gms.internal.measurement.zzabr
            {
                int i28 = 9;
                int i29 = 3;
                com.google.android.gms.internal.measurement.zzabo zzaboVar = null;
            }
        };
        zzbvs = zzabpVar10;
        final java.lang.String str3 = "MESSAGE";
        final int i28 = 10;
        final int i29 = 2;
        com.google.android.gms.internal.measurement.zzabp zzabpVar11 = new com.google.android.gms.internal.measurement.zzabp(str3, i28, zzabuVar4, i29) { // from class: com.google.android.gms.internal.measurement.zzabs
            {
                int i37 = 10;
                int i38 = 2;
                com.google.android.gms.internal.measurement.zzabo zzaboVar = null;
            }
        };
        zzbvt = zzabpVar11;
        final com.google.android.gms.internal.measurement.zzabu zzabuVar5 = com.google.android.gms.internal.measurement.zzabu.BYTE_STRING;
        final java.lang.String str4 = "BYTES";
        final int i37 = 11;
        com.google.android.gms.internal.measurement.zzabp zzabpVar12 = new com.google.android.gms.internal.measurement.zzabp(str4, i37, zzabuVar5, i29) { // from class: com.google.android.gms.internal.measurement.zzabt
            {
                int i38 = 11;
                int i39 = 2;
                com.google.android.gms.internal.measurement.zzabo zzaboVar = null;
            }
        };
        zzbvu = zzabpVar12;
        com.google.android.gms.internal.measurement.zzabp zzabpVar13 = new com.google.android.gms.internal.measurement.zzabp("UINT32", 12, zzabuVar2, 0);
        zzbvv = zzabpVar13;
        com.google.android.gms.internal.measurement.zzabp zzabpVar14 = new com.google.android.gms.internal.measurement.zzabp("ENUM", 13, com.google.android.gms.internal.measurement.zzabu.ENUM, 0);
        zzbvw = zzabpVar14;
        com.google.android.gms.internal.measurement.zzabp zzabpVar15 = new com.google.android.gms.internal.measurement.zzabp("SFIXED32", 14, zzabuVar2, 5);
        zzbvx = zzabpVar15;
        com.google.android.gms.internal.measurement.zzabp zzabpVar16 = new com.google.android.gms.internal.measurement.zzabp("SFIXED64", 15, zzabuVar, 1);
        zzbvy = zzabpVar16;
        com.google.android.gms.internal.measurement.zzabp zzabpVar17 = new com.google.android.gms.internal.measurement.zzabp("SINT32", 16, zzabuVar2, 0);
        zzbvz = zzabpVar17;
        com.google.android.gms.internal.measurement.zzabp zzabpVar18 = new com.google.android.gms.internal.measurement.zzabp("SINT64", 17, zzabuVar, 0);
        zzbwa = zzabpVar18;
        zzbwd = new com.google.android.gms.internal.measurement.zzabp[]{zzabpVar, zzabpVar2, zzabpVar3, zzabpVar4, zzabpVar5, zzabpVar6, zzabpVar7, zzabpVar8, zzabpVar9, zzabpVar10, zzabpVar11, zzabpVar12, zzabpVar13, zzabpVar14, zzabpVar15, zzabpVar16, zzabpVar17, zzabpVar18};
    }

    private zzabp(java.lang.String str, int i17, com.google.android.gms.internal.measurement.zzabu zzabuVar, int i18) {
        this.zzbwb = zzabuVar;
        this.zzbwc = i18;
    }

    public static com.google.android.gms.internal.measurement.zzabp[] values() {
        return (com.google.android.gms.internal.measurement.zzabp[]) zzbwd.clone();
    }

    public final com.google.android.gms.internal.measurement.zzabu zzuv() {
        return this.zzbwb;
    }

    public /* synthetic */ zzabp(java.lang.String str, int i17, com.google.android.gms.internal.measurement.zzabu zzabuVar, int i18, com.google.android.gms.internal.measurement.zzabo zzaboVar) {
        this(str, i17, zzabuVar, i18);
    }
}
