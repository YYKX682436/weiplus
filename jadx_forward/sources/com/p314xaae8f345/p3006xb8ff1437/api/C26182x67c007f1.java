package com.p314xaae8f345.p3006xb8ff1437.api;

/* renamed from: com.tencent.thumbplayer.api.TPOptionalParam */
/* loaded from: classes16.dex */
public class C26182x67c007f1 {

    /* renamed from: TP_OPTIONAL_PARAM_TYPE_BOOLEAN */
    public static final int f50709xe9787291 = 1;

    /* renamed from: TP_OPTIONAL_PARAM_TYPE_FLOAT */
    public static final int f50710xb0ceb305 = 6;

    /* renamed from: TP_OPTIONAL_PARAM_TYPE_INT */
    public static final int f50711xa3bf42d8 = 8;

    /* renamed from: TP_OPTIONAL_PARAM_TYPE_LONG */
    public static final int f50712xd42a7893 = 2;

    /* renamed from: TP_OPTIONAL_PARAM_TYPE_OBJECT */
    public static final int f50713x77d42796 = 7;

    /* renamed from: TP_OPTIONAL_PARAM_TYPE_QUEUE_INT */
    public static final int f50714x8ada87ca = 4;

    /* renamed from: TP_OPTIONAL_PARAM_TYPE_QUEUE_STRING */
    public static final int f50715x9e052236 = 5;

    /* renamed from: TP_OPTIONAL_PARAM_TYPE_STRING */
    public static final int f50716x7fa8e468 = 3;

    /* renamed from: TP_OPTIONAL_PARAM_TYPE_UNKNOWN */
    public static final int f50717xd4a2b2b3 = -1;

    @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId
    private int key;

    /* renamed from: paramBoolean */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamBoolean f50718x60f6a2db;

    /* renamed from: paramFloat */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamFloat f50719x199f69cf;

    /* renamed from: paramInt */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamInt f50720x45d22022;

    /* renamed from: paramLong */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamLong f50721x747344a9;

    /* renamed from: paramObject */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamObject f50722x291a4a2c;

    /* renamed from: paramQueueInt */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamQueueInt f50723xe2c0cb;

    /* renamed from: paramQueueString */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamQueueString f50724x24e739b5;

    /* renamed from: paramString */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamString f50725x30ef06fe;

    /* renamed from: paramType */
    private int f50726x74770d67 = -1;

    /* renamed from: com.tencent.thumbplayer.api.TPOptionalParam$OptionalParamBoolean */
    /* loaded from: classes16.dex */
    public static class OptionalParamBoolean {

        /* renamed from: value */
        public boolean f50727x6ac9171;
    }

    /* renamed from: com.tencent.thumbplayer.api.TPOptionalParam$OptionalParamFloat */
    /* loaded from: classes16.dex */
    public static class OptionalParamFloat {

        /* renamed from: param1 */
        public float f50728xc4aaf944;

        /* renamed from: param2 */
        public float f50729xc4aaf945;

        /* renamed from: value */
        public float f50730x6ac9171;
    }

    /* renamed from: com.tencent.thumbplayer.api.TPOptionalParam$OptionalParamInt */
    /* loaded from: classes16.dex */
    public static class OptionalParamInt {

        /* renamed from: value */
        public int f50731x6ac9171;
    }

    /* renamed from: com.tencent.thumbplayer.api.TPOptionalParam$OptionalParamLong */
    /* loaded from: classes16.dex */
    public static class OptionalParamLong {

        /* renamed from: param1 */
        public long f50732xc4aaf944;

        /* renamed from: param2 */
        public long f50733xc4aaf945;

        /* renamed from: value */
        public long f50734x6ac9171;
    }

    /* renamed from: com.tencent.thumbplayer.api.TPOptionalParam$OptionalParamObject */
    /* loaded from: classes16.dex */
    public static class OptionalParamObject {

        /* renamed from: objectValue */
        public java.lang.Object f50735xb3582d72;
    }

    /* renamed from: com.tencent.thumbplayer.api.TPOptionalParam$OptionalParamQueueInt */
    /* loaded from: classes16.dex */
    public static class OptionalParamQueueInt {

        /* renamed from: queueValue */
        public int[] f50736x72048ae0;
    }

    /* renamed from: com.tencent.thumbplayer.api.TPOptionalParam$OptionalParamQueueString */
    /* loaded from: classes16.dex */
    public static class OptionalParamQueueString {

        /* renamed from: queueValue */
        public java.lang.String[] f50737x72048ae0;
    }

    /* renamed from: com.tencent.thumbplayer.api.TPOptionalParam$OptionalParamString */
    /* loaded from: classes16.dex */
    public static class OptionalParamString {

        /* renamed from: param1 */
        public java.lang.String f50738xc4aaf944;

        /* renamed from: param2 */
        public java.lang.String f50739xc4aaf945;

        /* renamed from: value */
        public java.lang.String f50740x6ac9171;
    }

    /* renamed from: buildBoolean */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m101058xb88ec5da(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, boolean z17) {
        this.f50726x74770d67 = 1;
        this.key = i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamBoolean optionalParamBoolean = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamBoolean();
        this.f50718x60f6a2db = optionalParamBoolean;
        optionalParamBoolean.f50727x6ac9171 = z17;
        return this;
    }

    /* renamed from: buildFloat */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m101059xe292408e(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, float f17) {
        this.f50726x74770d67 = 6;
        this.key = i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamFloat optionalParamFloat = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamFloat();
        this.f50719x199f69cf = optionalParamFloat;
        optionalParamFloat.f50730x6ac9171 = f17;
        return this;
    }

    /* renamed from: buildInt */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m101061xaab99aa1(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, int i18) {
        this.f50726x74770d67 = 8;
        this.key = i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamInt optionalParamInt = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamInt();
        this.f50720x45d22022 = optionalParamInt;
        optionalParamInt.f50731x6ac9171 = i18;
        return this;
    }

    /* renamed from: buildLong */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m101062xac7b1a0a(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, long j17) {
        this.f50726x74770d67 = 2;
        this.key = i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamLong optionalParamLong = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamLong();
        this.f50721x747344a9 = optionalParamLong;
        optionalParamLong.f50734x6ac9171 = j17;
        return this;
    }

    /* renamed from: buildObject */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m101064x7e824b4d(int i17, java.lang.Object obj) {
        this.f50726x74770d67 = 7;
        this.key = i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamObject optionalParamObject = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamObject();
        this.f50722x291a4a2c = optionalParamObject;
        optionalParamObject.f50735xb3582d72 = obj;
        return this;
    }

    /* renamed from: buildQueueInt */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m101065x9c4efdac(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, int[] iArr) {
        this.f50726x74770d67 = 4;
        this.key = i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamQueueInt optionalParamQueueInt = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamQueueInt();
        this.f50723xe2c0cb = optionalParamQueueInt;
        optionalParamQueueInt.f50736x72048ae0 = iArr;
        return this;
    }

    /* renamed from: buildQueueString */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m101066xdda7c534(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, java.lang.String[] strArr) {
        this.f50726x74770d67 = 5;
        this.key = i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamQueueString optionalParamQueueString = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamQueueString();
        this.f50724x24e739b5 = optionalParamQueueString;
        optionalParamQueueString.f50737x72048ae0 = strArr;
        return this;
    }

    /* renamed from: buildString */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m101067x8657081f(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, java.lang.String str) {
        this.f50726x74770d67 = 3;
        this.key = i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamString optionalParamString = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamString();
        this.f50725x30ef06fe = optionalParamString;
        optionalParamString.f50740x6ac9171 = str;
        return this;
    }

    @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId
    /* renamed from: getKey */
    public int m101069xb5884f29() {
        return this.key;
    }

    /* renamed from: getParamBoolean */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamBoolean m101070xc1e93551() {
        return this.f50718x60f6a2db;
    }

    /* renamed from: getParamFloat */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamFloat m101071x7e021c5() {
        return this.f50719x199f69cf;
    }

    /* renamed from: getParamInt */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamInt m101072xc1ac5d98() {
        return this.f50720x45d22022;
    }

    /* renamed from: getParamLong */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamLong m101073x73e0b5f3() {
        return this.f50721x747344a9;
    }

    /* renamed from: getParamObject */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamObject m101074x2f090f6() {
        return this.f50722x291a4a2c;
    }

    /* renamed from: getParamQueueInt */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamQueueInt m101075xbe427d15() {
        return this.f50723xe2c0cb;
    }

    /* renamed from: getParamQueueString */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamQueueString m101076xccbfa12b() {
        return this.f50724x24e739b5;
    }

    /* renamed from: getParamString */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamString m101077xac54dc8() {
        return this.f50725x30ef06fe;
    }

    /* renamed from: getParamType */
    public int m101078x73e47eb1() {
        return this.f50726x74770d67;
    }

    /* renamed from: toString */
    public java.lang.String m101079x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        switch (this.f50726x74770d67) {
            case 1:
                sb6.append("type:long, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100883x964bf2bc(this.key));
                sb6.append(", value:");
                sb6.append(this.f50718x60f6a2db.f50727x6ac9171);
                break;
            case 2:
                sb6.append("type:long, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100883x964bf2bc(this.key));
                sb6.append(", value:");
                sb6.append(this.f50721x747344a9.f50734x6ac9171);
                sb6.append(", param1:");
                sb6.append(this.f50721x747344a9.f50732xc4aaf944);
                sb6.append(", param2:");
                sb6.append(this.f50721x747344a9.f50733xc4aaf945);
                break;
            case 3:
                sb6.append("type:string, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100883x964bf2bc(this.key));
                sb6.append(", value:");
                sb6.append(this.f50725x30ef06fe.f50740x6ac9171);
                sb6.append(", param1:");
                sb6.append(this.f50725x30ef06fe.f50738xc4aaf944);
                sb6.append(", param2:");
                sb6.append(this.f50725x30ef06fe.f50739xc4aaf945);
                break;
            case 4:
                sb6.append("type:quint_int, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100883x964bf2bc(this.key));
                sb6.append(", value:");
                int[] iArr = this.f50723xe2c0cb.f50736x72048ae0;
                if (iArr != null) {
                    int length = iArr.length;
                    while (i17 < length) {
                        sb6.append(iArr[i17]);
                        sb6.append(", ");
                        i17++;
                    }
                    break;
                }
                break;
            case 5:
                sb6.append("type:quint_string, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100883x964bf2bc(this.key));
                sb6.append(", value:");
                java.lang.String[] strArr = this.f50724x24e739b5.f50737x72048ae0;
                if (strArr != null) {
                    int length2 = strArr.length;
                    while (i17 < length2) {
                        sb6.append(strArr[i17]);
                        sb6.append(", ");
                        i17++;
                    }
                    break;
                }
                break;
            case 6:
                sb6.append("type:float, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100883x964bf2bc(this.key));
                sb6.append(", value:");
                sb6.append(this.f50719x199f69cf.f50730x6ac9171);
                sb6.append(", param1:");
                sb6.append(this.f50719x199f69cf.f50728xc4aaf944);
                sb6.append(", param2:");
                sb6.append(this.f50719x199f69cf.f50729xc4aaf945);
                break;
            case 7:
                sb6.append("type:object, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100883x964bf2bc(this.key));
                sb6.append(", value:");
                sb6.append(this.f50722x291a4a2c.f50735xb3582d72);
                break;
            case 8:
                sb6.append("type:int, key:" + this.key + ", value:" + this.f50720x45d22022.f50731x6ac9171);
                break;
            default:
                sb6.append("type:unknown");
                break;
        }
        return sb6.toString();
    }

    /* renamed from: buildFloat */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m101060xe292408e(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, float f17, float f18, float f19) {
        this.f50726x74770d67 = 6;
        this.key = i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamFloat optionalParamFloat = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamFloat();
        this.f50719x199f69cf = optionalParamFloat;
        optionalParamFloat.f50730x6ac9171 = f17;
        optionalParamFloat.f50728xc4aaf944 = f18;
        optionalParamFloat.f50729xc4aaf945 = f19;
        return this;
    }

    /* renamed from: buildLong */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m101063xac7b1a0a(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, long j17, long j18, long j19) {
        this.f50726x74770d67 = 2;
        this.key = i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamLong optionalParamLong = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamLong();
        this.f50721x747344a9 = optionalParamLong;
        optionalParamLong.f50734x6ac9171 = j17;
        optionalParamLong.f50732xc4aaf944 = j18;
        optionalParamLong.f50733xc4aaf945 = j19;
        return this;
    }

    /* renamed from: buildString */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m101068x8657081f(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f50726x74770d67 = 3;
        this.key = i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamString optionalParamString = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamString();
        this.f50725x30ef06fe = optionalParamString;
        optionalParamString.f50740x6ac9171 = str;
        optionalParamString.f50738xc4aaf944 = str2;
        optionalParamString.f50739xc4aaf945 = str3;
        return this;
    }
}
