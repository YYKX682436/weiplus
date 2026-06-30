package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants;", "", "()V", "ID_RESOURCE_TYPE", "", "NORMAL_STRING_TYPE", "PARAM_METHOD_TYPE", "STRING_RESOURCE_TYPE", "AreaConfig", "ConditionConstants", "ProviderAuthority", "ReportKey", "ReportMMKVKey", "ServiceName", "ServicePackage", "ServiceTypeValue", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccConstants {
    public static final int $stable = 0;
    public static final java.lang.String ID_RESOURCE_TYPE = "id_resource_type";
    public static final com.tencent.mm.accessibility.core.AccConstants INSTANCE = new com.tencent.mm.accessibility.core.AccConstants();
    public static final java.lang.String NORMAL_STRING_TYPE = "normal_string_type";
    public static final java.lang.String PARAM_METHOD_TYPE = "param_method_type";
    public static final java.lang.String STRING_RESOURCE_TYPE = "string_resource_type";

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$AreaConfig;", "", "()V", "DEFAULT_MIN_HEIGHT", "", "DEFAULT_MIN_WIDTH", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AreaConfig {
        public static final int $stable = 0;
        public static final int DEFAULT_MIN_HEIGHT = 44;
        public static final int DEFAULT_MIN_WIDTH = 44;
        public static final com.tencent.mm.accessibility.core.AccConstants.AreaConfig INSTANCE = new com.tencent.mm.accessibility.core.AccConstants.AreaConfig();

        private AreaConfig() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ConditionConstants;", "", "Lkotlin/Function1;", "Landroid/view/View;", "", "DEFAULT_DISABLE_FALSE", "Lyz5/l;", "getDEFAULT_DISABLE_FALSE", "()Lyz5/l;", "DEFAULT_DISABLE_TRUE", "getDEFAULT_DISABLE_TRUE", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class ConditionConstants {
        public static final int $stable = 0;
        public static final com.tencent.mm.accessibility.core.AccConstants.ConditionConstants INSTANCE = new com.tencent.mm.accessibility.core.AccConstants.ConditionConstants();
        private static final yz5.l DEFAULT_DISABLE_FALSE = com.tencent.mm.accessibility.core.AccConstants$ConditionConstants$DEFAULT_DISABLE_FALSE$1.INSTANCE;
        private static final yz5.l DEFAULT_DISABLE_TRUE = com.tencent.mm.accessibility.core.AccConstants$ConditionConstants$DEFAULT_DISABLE_TRUE$1.INSTANCE;

        private ConditionConstants() {
        }

        public final yz5.l getDEFAULT_DISABLE_FALSE() {
            return DEFAULT_DISABLE_FALSE;
        }

        public final yz5.l getDEFAULT_DISABLE_TRUE() {
            return DEFAULT_DISABLE_TRUE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ProviderAuthority;", "", "()V", "ACC_ACTION", "", "ACC_EVENT", "INFLATE", "NODE_INFO", "NONE", "ONTOUCH_EVENT", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ProviderAuthority {
        public static final int $stable = 0;
        public static final int ACC_ACTION = 8;
        public static final int ACC_EVENT = 4;
        public static final int INFLATE = 2;
        public static final com.tencent.mm.accessibility.core.AccConstants.ProviderAuthority INSTANCE = new com.tencent.mm.accessibility.core.AccConstants.ProviderAuthority();
        public static final int NODE_INFO = 1;
        public static final int NONE = 0;
        public static final int ONTOUCH_EVENT = 16;

        private ProviderAuthority() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ReportKey;", "", "()V", "Hierarchy_Invoke_Throw", "", "Hierarchy_Reflect_Throw", "ID", "Touch_Exploration_Enable", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ReportKey {
        public static final int $stable = 0;
        public static final long Hierarchy_Invoke_Throw = 2;
        public static final long Hierarchy_Reflect_Throw = 1;
        public static final long ID = 1784;
        public static final com.tencent.mm.accessibility.core.AccConstants.ReportKey INSTANCE = new com.tencent.mm.accessibility.core.AccConstants.ReportKey();
        public static final long Touch_Exploration_Enable = 0;

        private ReportKey() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ReportMMKVKey;", "", "()V", com.tencent.mm.accessibility.core.AccConstants.ReportMMKVKey.HasReportDataString, "", com.tencent.mm.accessibility.core.AccConstants.ReportMMKVKey.LastReportTimeLong, "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ReportMMKVKey {
        public static final int $stable = 0;
        public static final java.lang.String HasReportDataString = "HasReportDataString";
        public static final com.tencent.mm.accessibility.core.AccConstants.ReportMMKVKey INSTANCE = new com.tencent.mm.accessibility.core.AccConstants.ReportMMKVKey();
        public static final java.lang.String LastReportTimeLong = "LastReportTimeLong";

        private ReportMMKVKey() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ServiceName;", "", "()V", "Boyhood", "", "DianMing", "JieShuo", "ScreenReader", "TalkBack", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ServiceName {
        public static final int $stable = 0;
        public static final java.lang.String Boyhood = "BoyhoodVoiceBackService";
        public static final java.lang.String DianMing = "MyAccessibilityService";
        public static final com.tencent.mm.accessibility.core.AccConstants.ServiceName INSTANCE = new com.tencent.mm.accessibility.core.AccConstants.ServiceName();
        public static final java.lang.String JieShuo = "TalkManAccessibilityService";
        public static final java.lang.String ScreenReader = "ScreenReaderService";
        public static final java.lang.String TalkBack = "TalkBackService";

        private ServiceName() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ServicePackage;", "", "()V", "Boyhood", "", "DianMing", "JieShuo", "ScreenReader", "TalkBack", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ServicePackage {
        public static final int $stable = 0;
        public static final java.lang.String Boyhood = "com.bjbyhd.voiceback";
        public static final java.lang.String DianMing = "com.dianming.phoneapp";
        public static final com.tencent.mm.accessibility.core.AccConstants.ServicePackage INSTANCE = new com.tencent.mm.accessibility.core.AccConstants.ServicePackage();
        public static final java.lang.String JieShuo = "com.nirenr.talkman";
        public static final java.lang.String ScreenReader = "com.bjbyhd.screenreader_huawei";
        public static final java.lang.String TalkBack = "com.google.android.marvin";

        private ServicePackage() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ServiceTypeValue;", "", "()V", "DianMing", "", "JieShuo", "ScreenReader", "TalkBack", "UNKNOWN", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ServiceTypeValue {
        public static final int $stable = 0;
        public static final int DianMing = 3;
        public static final com.tencent.mm.accessibility.core.AccConstants.ServiceTypeValue INSTANCE = new com.tencent.mm.accessibility.core.AccConstants.ServiceTypeValue();
        public static final int JieShuo = 4;
        public static final int ScreenReader = 2;
        public static final int TalkBack = 1;
        public static final int UNKNOWN = 0;

        private ServiceTypeValue() {
        }
    }

    private AccConstants() {
    }
}
