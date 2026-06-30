package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.GuaranteedConfigurationsUtil */
/* loaded from: classes13.dex */
public final class C0250x2ffe8bfb {
    private C0250x2ffe8bfb() {
    }

    /* renamed from: generateSupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3466x48c9fc14(int i17, boolean z17, boolean z18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(m3471xd8473f5e());
        if (i17 == 0 || i17 == 1 || i17 == 3) {
            arrayList.addAll(m3473xd7455b03());
        }
        if (i17 == 1 || i17 == 3) {
            arrayList.addAll(m3470xb1bdc1a4());
        }
        if (z17) {
            arrayList.addAll(m3475x25c2e491());
        }
        if (z18 && i17 == 0) {
            arrayList.addAll(m3468x4ba2709());
        }
        if (i17 == 3) {
            arrayList.addAll(m3472xc539cec4());
        }
        return arrayList;
    }

    /* renamed from: get10BitSupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3467x8c649a77() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4022);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4023 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW;
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG;
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize));
        arrayList.add(c0757xf0d4f4023);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4024 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4024);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4025 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4025);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4026 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.RECORD;
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize3));
        arrayList.add(c0757xf0d4f4026);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4027 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize3));
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize3));
        arrayList.add(c0757xf0d4f4027);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4028 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize3));
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize3));
        arrayList.add(c0757xf0d4f4028);
        return arrayList;
    }

    /* renamed from: getBurstSupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3468x4ba2709() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        arrayList.add(c0757xf0d4f4022);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4023 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        arrayList.add(c0757xf0d4f4023);
        return arrayList;
    }

    /* renamed from: getConcurrentSupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3469x7e9b5c4c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.s1440p;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4022);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4023 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG;
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize));
        arrayList.add(c0757xf0d4f4023);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4024 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.s720p;
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize));
        arrayList.add(c0757xf0d4f4024);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4025 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize));
        arrayList.add(c0757xf0d4f4025);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4026 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4026);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4027 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4027);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4028 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4028);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4029 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4029.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4029.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4029);
        return arrayList;
    }

    /* renamed from: getFullSupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3470xb1bdc1a4() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        arrayList.add(c0757xf0d4f4022);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4023 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        arrayList.add(c0757xf0d4f4023);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4024 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG, configSize2));
        arrayList.add(c0757xf0d4f4024);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4025 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.VGA;
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize3));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        arrayList.add(c0757xf0d4f4025);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4026 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize3));
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        arrayList.add(c0757xf0d4f4026);
        return arrayList;
    }

    /* renamed from: getLegacySupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3471xd8473f5e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG;
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4022);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4023 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize));
        arrayList.add(c0757xf0d4f4023);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4024 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW;
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4024);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4025 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4025);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4026 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        arrayList.add(c0757xf0d4f4026);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4027 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        arrayList.add(c0757xf0d4f4027);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4028 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4028);
        return arrayList;
    }

    /* renamed from: getLevel3SupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3472xc539cec4() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.VGA;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize3));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.RAW;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize3));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG, configSize3));
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize3));
        arrayList.add(c0757xf0d4f4022);
        return arrayList;
    }

    /* renamed from: getLimitedSupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3473xd7455b03() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.RECORD;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        arrayList.add(c0757xf0d4f4022);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4023 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        arrayList.add(c0757xf0d4f4023);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4024 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize2));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG;
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        arrayList.add(c0757xf0d4f4024);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4025 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        arrayList.add(c0757xf0d4f4025);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4026 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM));
        arrayList.add(c0757xf0d4f4026);
        return arrayList;
    }

    /* renamed from: getPreviewStabilizationSupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3474x7da90a0c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.s1440p;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4022);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4023 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM;
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        arrayList.add(c0757xf0d4f4023);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4024 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        arrayList.add(c0757xf0d4f4024);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4025 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        arrayList.add(c0757xf0d4f4025);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4026 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        arrayList.add(c0757xf0d4f4026);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4027 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW;
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize3));
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4027);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4028 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize3));
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4028);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4029 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4029.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize3));
        c0757xf0d4f4029.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f4029);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f40210 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f40210.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize3));
        c0757xf0d4f40210.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize));
        arrayList.add(c0757xf0d4f40210);
        return arrayList;
    }

    /* renamed from: getRAWSupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3475x25c2e491() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.RAW;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW;
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4022);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4023 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4023);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4024 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4024);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4025 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4025);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4026 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4026);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4027 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG;
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType4, configSize));
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4027);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4028 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize2));
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType4, configSize));
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4028);
        return arrayList;
    }

    /* renamed from: getStreamUseCaseSupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3476xf3c30a0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.s1440p;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize, 4L));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType2, configSize, 4L));
        arrayList.add(c0757xf0d4f4022);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4023 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.RECORD;
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize2, 3L));
        arrayList.add(c0757xf0d4f4023);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4024 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType2, configSize2, 3L));
        arrayList.add(c0757xf0d4f4024);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4025 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM;
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType3, configSize3, 2L));
        arrayList.add(c0757xf0d4f4025);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4026 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType2, configSize3, 2L));
        arrayList.add(c0757xf0d4f4026);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4027 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW;
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize4, 1L));
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType3, configSize3, 2L));
        arrayList.add(c0757xf0d4f4027);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4028 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize4, 1L));
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType2, configSize3, 2L));
        arrayList.add(c0757xf0d4f4028);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4029 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4029.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize4, 1L));
        c0757xf0d4f4029.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize2, 3L));
        arrayList.add(c0757xf0d4f4029);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f40210 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f40210.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize4, 1L));
        c0757xf0d4f40210.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType2, configSize2, 3L));
        arrayList.add(c0757xf0d4f40210);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f40211 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f40211.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize4, 1L));
        c0757xf0d4f40211.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType2, configSize4, 1L));
        arrayList.add(c0757xf0d4f40211);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f40212 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f40212.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize4, 1L));
        c0757xf0d4f40212.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize2, 3L));
        c0757xf0d4f40212.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType3, configSize2, 2L));
        arrayList.add(c0757xf0d4f40212);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f40213 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f40213.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize4, 1L));
        c0757xf0d4f40213.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType2, configSize2, 3L));
        c0757xf0d4f40213.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType3, configSize2, 2L));
        arrayList.add(c0757xf0d4f40213);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f40214 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f40214.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType, configSize4, 1L));
        c0757xf0d4f40214.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType2, configSize4, 1L));
        c0757xf0d4f40214.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5681xaf65a0fc(configType3, configSize3, 2L));
        arrayList.add(c0757xf0d4f40214);
        return arrayList;
    }

    /* renamed from: getUltraHdrSupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3477xeb6ee6bf() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG_R;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW));
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        arrayList.add(c0757xf0d4f4022);
        return arrayList;
    }

    /* renamed from: getUltraHighResolutionSupportedCombinationList */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3478x6d9add23() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.ULTRA_MAXIMUM;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.RECORD;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize3));
        arrayList.add(c0757xf0d4f402);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4022 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG;
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize));
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4022.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize3));
        arrayList.add(c0757xf0d4f4022);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4023 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.RAW;
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType4, configSize));
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4023.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize3));
        arrayList.add(c0757xf0d4f4023);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4024 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM;
        c0757xf0d4f4024.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize4));
        arrayList.add(c0757xf0d4f4024);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4025 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4025.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize4));
        arrayList.add(c0757xf0d4f4025);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4026 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType4, configSize));
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4026.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize4));
        arrayList.add(c0757xf0d4f4026);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4027 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4027.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize4));
        arrayList.add(c0757xf0d4f4027);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4028 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize));
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4028.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize4));
        arrayList.add(c0757xf0d4f4028);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f4029 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f4029.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType4, configSize));
        c0757xf0d4f4029.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f4029.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize4));
        arrayList.add(c0757xf0d4f4029);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f40210 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f40210.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, configSize));
        c0757xf0d4f40210.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f40210.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType4, configSize4));
        arrayList.add(c0757xf0d4f40210);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f40211 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f40211.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType3, configSize));
        c0757xf0d4f40211.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f40211.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType4, configSize4));
        arrayList.add(c0757xf0d4f40211);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f40212 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        c0757xf0d4f40212.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType4, configSize));
        c0757xf0d4f40212.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType2, configSize2));
        c0757xf0d4f40212.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType4, configSize4));
        arrayList.add(c0757xf0d4f40212);
        return arrayList;
    }
}
