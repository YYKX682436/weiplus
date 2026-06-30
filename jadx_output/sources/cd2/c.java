package cd2;

/* loaded from: classes10.dex */
public final class c {
    private java.lang.String field_aggregateTitle;
    private r45.rg2 field_aggregatedContacts;
    private com.tencent.mm.protocal.protobuf.FinderContact field_authorContact;
    private int field_businessType;
    private java.lang.String field_clientMsgId;
    private r45.e60 field_commentContentInfo;
    private int field_commentContentType;
    private long field_commentId;
    private r45.oy0 field_commentMentionedUser;
    private com.tencent.mm.protocal.protobuf.FinderContact field_contact;
    private java.lang.String field_content;
    private int field_createTime;
    private java.lang.String field_description;
    private int field_extFlag;
    private r45.vg2 field_extInfo;
    private long field_fansId;
    private r45.ub1 field_finderIdentity;
    private java.lang.String field_finderUserName;
    private int field_flag;
    private long field_followExpireTime;
    private int field_followFlag;
    private long field_followId;
    private r45.r31 field_followReason;
    private int field_forceUseContent;
    private java.lang.String field_headUrl;
    private r45.fb1 field_help_promotion_info;
    private long field_id;
    private int field_interactionCount;
    private int field_isSilentMention;
    private com.tencent.mm.protocal.protobuf.FinderJumpInfo field_jumpInfo;
    private int field_jumpType;
    private long field_likeId;
    private r45.t64 field_likeInfo;
    private int field_likeType;
    private int field_mediaType;
    private java.lang.String field_memberProviderFinderusername;
    private int field_mentionSubtype;
    private java.lang.String field_nickname;
    private r45.rk2 field_notify;
    private long field_objectId;
    private java.lang.String field_objectNonceId;
    private long field_objectType;
    private int field_orderCount;
    private java.lang.String field_refContent;
    private long field_refVideoObjectId;
    private java.lang.String field_refVideoObjectNonceId;
    private int field_relationType;
    private java.lang.String field_replayNickname;
    private java.lang.String field_replayUsername;
    private com.tencent.mm.protocal.protobuf.FinderContact field_replyContact;
    private long field_rootCommentId;
    private java.lang.String field_silentMentionEntityId;
    private int field_sourceType;
    private r45.pg2 field_svrMention;
    private long field_svrMentionId;
    private java.lang.String field_svrReportInfo;
    private int field_thankIconType;
    private r45.xg2 field_thankInfo;
    private java.lang.String field_thumbUrl;
    private int field_type;
    private int field_userVersion;
    private java.lang.String field_username;

    public c(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, java.lang.String str4, long j17, long j18, long j19, int i19, java.lang.String str5, int i27, int i28, java.lang.String str6, r45.rk2 rk2Var, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i29, java.lang.String str10, com.tencent.mm.protocal.protobuf.FinderContact finderContact, com.tencent.mm.protocal.protobuf.FinderContact finderContact2, r45.rg2 rg2Var, long j27, java.lang.String str11, long j28, long j29, long j37, java.lang.String str12, long j38, long j39, com.tencent.mm.protocal.protobuf.FinderContact finderContact3, int i37, r45.oy0 oy0Var, int i38, r45.vg2 vg2Var, long j47, java.lang.String str13, int i39, r45.t64 t64Var, r45.xg2 xg2Var, int i47, r45.ub1 ub1Var, int i48, int i49, r45.r31 r31Var, int i57, int i58, java.lang.String str14, int i59, long j48, java.lang.String str15, int i66, r45.fb1 fb1Var, r45.pg2 pg2Var, int i67, java.lang.String str16, java.lang.String str17, int i68, r45.e60 e60Var, int i69, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, int i76, int i77, kotlin.jvm.internal.i iVar) {
        java.lang.String str18 = (i76 & 1) != 0 ? null : str;
        java.lang.String str19 = (i76 & 2) != 0 ? null : str2;
        int i78 = (i76 & 4) != 0 ? 0 : i17;
        java.lang.String str20 = (i76 & 8) != 0 ? null : str3;
        int i79 = (i76 & 16) != 0 ? 0 : i18;
        java.lang.String str21 = (i76 & 32) != 0 ? null : str4;
        long j49 = (i76 & 64) != 0 ? 0L : j17;
        long j57 = (i76 & 128) != 0 ? 0L : j18;
        long j58 = (i76 & 256) != 0 ? 0L : j19;
        int i86 = (i76 & 512) != 0 ? 0 : i19;
        java.lang.String str22 = (i76 & 1024) != 0 ? null : str5;
        int i87 = (i76 & 2048) != 0 ? 0 : i27;
        int i88 = (i76 & 4096) != 0 ? 0 : i28;
        java.lang.String str23 = (i76 & 8192) != 0 ? null : str6;
        r45.rk2 rk2Var2 = (i76 & 16384) != 0 ? null : rk2Var;
        java.lang.String str24 = (i76 & 32768) != 0 ? null : str7;
        java.lang.String str25 = (i76 & 65536) != 0 ? null : str8;
        java.lang.String str26 = (i76 & 131072) != 0 ? null : str9;
        int i89 = (i76 & 262144) != 0 ? 0 : i29;
        java.lang.String str27 = (i76 & 524288) != 0 ? null : str10;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = (i76 & 1048576) != 0 ? null : finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5 = (i76 & 2097152) != 0 ? null : finderContact2;
        r45.rg2 rg2Var2 = (i76 & 4194304) != 0 ? null : rg2Var;
        long j59 = (i76 & 8388608) != 0 ? 0L : j27;
        java.lang.String str28 = (i76 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? null : str11;
        long j66 = (i76 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? 0L : j28;
        long j67 = (i76 & 67108864) != 0 ? 0L : j29;
        long j68 = (i76 & 134217728) != 0 ? 0L : j37;
        java.lang.String str29 = (i76 & 268435456) != 0 ? null : str12;
        long j69 = (i76 & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? 0L : j38;
        long j76 = (i76 & 1073741824) != 0 ? 0L : j39;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact6 = (i76 & Integer.MIN_VALUE) != 0 ? null : finderContact3;
        int i96 = (i77 & 1) != 0 ? 0 : i37;
        r45.oy0 oy0Var2 = (i77 & 2) != 0 ? null : oy0Var;
        int i97 = (i77 & 4) != 0 ? 0 : i38;
        r45.vg2 vg2Var2 = (i77 & 8) != 0 ? null : vg2Var;
        long j77 = (i77 & 16) != 0 ? 0L : j47;
        java.lang.String str30 = (i77 & 32) != 0 ? null : str13;
        int i98 = (i77 & 64) != 0 ? 0 : i39;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact7 = finderContact6;
        r45.t64 t64Var2 = (i77 & 128) != 0 ? null : t64Var;
        r45.xg2 xg2Var2 = (i77 & 256) != 0 ? null : xg2Var;
        int i99 = (i77 & 512) != 0 ? 0 : i47;
        r45.ub1 ub1Var2 = (i77 & 1024) != 0 ? null : ub1Var;
        int i100 = (i77 & 2048) != 0 ? 0 : i48;
        int i101 = (i77 & 4096) != 0 ? 0 : i49;
        r45.r31 r31Var2 = (i77 & 8192) != 0 ? null : r31Var;
        int i102 = (i77 & 16384) != 0 ? 0 : i57;
        int i103 = (i77 & 32768) != 0 ? 0 : i58;
        java.lang.String str31 = (i77 & 65536) != 0 ? null : str14;
        int i104 = (i77 & 131072) != 0 ? 0 : i59;
        long j78 = (i77 & 262144) != 0 ? 0L : j48;
        java.lang.String str32 = (i77 & 524288) != 0 ? null : str15;
        int i105 = (i77 & 1048576) != 0 ? 0 : i66;
        r45.fb1 fb1Var2 = (i77 & 2097152) != 0 ? null : fb1Var;
        r45.pg2 pg2Var2 = (i77 & 4194304) != 0 ? null : pg2Var;
        int i106 = (i77 & 8388608) != 0 ? 0 : i67;
        java.lang.String str33 = (i77 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? null : str16;
        java.lang.String str34 = (i77 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? null : str17;
        int i107 = (i77 & 67108864) != 0 ? 0 : i68;
        r45.e60 e60Var2 = (i77 & 134217728) != 0 ? null : e60Var;
        int i108 = (i77 & 268435456) != 0 ? 0 : i69;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (i77 & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : finderJumpInfo;
        this.field_headUrl = str18;
        this.field_nickname = str19;
        this.field_type = i78;
        this.field_content = str20;
        this.field_createTime = i79;
        this.field_thumbUrl = str21;
        this.field_id = j49;
        this.field_objectId = j57;
        this.field_commentId = j58;
        this.field_flag = i86;
        this.field_refContent = str22;
        this.field_extFlag = i87;
        this.field_mediaType = i88;
        this.field_description = str23;
        this.field_notify = rk2Var2;
        this.field_replayUsername = str24;
        this.field_replayNickname = str25;
        this.field_objectNonceId = str26;
        this.field_userVersion = i89;
        this.field_username = str27;
        this.field_contact = finderContact4;
        this.field_replyContact = finderContact5;
        this.field_aggregatedContacts = rg2Var2;
        this.field_followExpireTime = j59;
        this.field_clientMsgId = str28;
        this.field_followId = j66;
        this.field_objectType = j67;
        this.field_refVideoObjectId = j68;
        this.field_refVideoObjectNonceId = str29;
        this.field_likeId = j69;
        this.field_fansId = j76;
        this.field_authorContact = finderContact7;
        this.field_likeType = i96;
        this.field_commentMentionedUser = oy0Var2;
        this.field_relationType = i97;
        this.field_extInfo = vg2Var2;
        this.field_svrMentionId = j77;
        this.field_finderUserName = str30;
        this.field_followFlag = i98;
        this.field_likeInfo = t64Var2;
        this.field_thankInfo = xg2Var2;
        this.field_businessType = i99;
        this.field_finderIdentity = ub1Var2;
        this.field_sourceType = i100;
        this.field_mentionSubtype = i101;
        this.field_followReason = r31Var2;
        this.field_orderCount = i102;
        this.field_interactionCount = i103;
        this.field_memberProviderFinderusername = str31;
        this.field_forceUseContent = i104;
        this.field_rootCommentId = j78;
        this.field_svrReportInfo = str32;
        this.field_thankIconType = i105;
        this.field_help_promotion_info = fb1Var2;
        this.field_svrMention = pg2Var2;
        this.field_isSilentMention = i106;
        this.field_silentMentionEntityId = str33;
        this.field_aggregateTitle = str34;
        this.field_commentContentType = i107;
        this.field_commentContentInfo = e60Var2;
        this.field_jumpType = i108;
        this.field_jumpInfo = finderJumpInfo2;
    }

    public final void A(int i17) {
        this.field_commentContentType = i17;
    }

    public final void A0(java.lang.String str) {
        this.field_thumbUrl = str;
    }

    public final void B(long j17) {
        this.field_commentId = j17;
    }

    public final void B0(int i17) {
        this.field_type = i17;
    }

    public final void C(r45.oy0 oy0Var) {
        this.field_commentMentionedUser = oy0Var;
    }

    public final void C0(int i17) {
        this.field_userVersion = i17;
    }

    public final void D(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        this.field_contact = finderContact;
    }

    public final void D0(java.lang.String str) {
        this.field_username = str;
    }

    public final void E(java.lang.String str) {
        this.field_content = str;
    }

    public final void F(int i17) {
        this.field_createTime = i17;
    }

    public final void G(java.lang.String str) {
        this.field_description = str;
    }

    public final void H(int i17) {
        this.field_extFlag = i17;
    }

    public final void I(r45.vg2 vg2Var) {
        this.field_extInfo = vg2Var;
    }

    public final void J(long j17) {
        this.field_fansId = j17;
    }

    public final void K(r45.ub1 ub1Var) {
        this.field_finderIdentity = ub1Var;
    }

    public final void L(java.lang.String str) {
        this.field_finderUserName = str;
    }

    public final void M(int i17) {
        this.field_flag = i17;
    }

    public final void N(long j17) {
        this.field_followExpireTime = j17;
    }

    public final void O(int i17) {
        this.field_followFlag = i17;
    }

    public final void P(long j17) {
        this.field_followId = j17;
    }

    public final void Q(r45.r31 r31Var) {
        this.field_followReason = r31Var;
    }

    public final void R(int i17) {
        this.field_forceUseContent = i17;
    }

    public final void S(java.lang.String str) {
        this.field_headUrl = str;
    }

    public final void T(r45.fb1 fb1Var) {
        this.field_help_promotion_info = fb1Var;
    }

    public final void U(long j17) {
        this.field_id = j17;
    }

    public final void V(int i17) {
        this.field_interactionCount = i17;
    }

    public final void W(int i17) {
        this.field_isSilentMention = i17;
    }

    public final void X(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.field_jumpInfo = finderJumpInfo;
    }

    public final void Y(int i17) {
        this.field_jumpType = i17;
    }

    public final void Z(long j17) {
        this.field_likeId = j17;
    }

    public final long a() {
        return this.field_commentId;
    }

    public final void a0(r45.t64 t64Var) {
        this.field_likeInfo = t64Var;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact b() {
        return this.field_contact;
    }

    public final void b0(int i17) {
        this.field_likeType = i17;
    }

    public final java.lang.String c() {
        return this.field_content;
    }

    public final void c0(int i17) {
        this.field_mediaType = i17;
    }

    public final int d() {
        return this.field_createTime;
    }

    public final void d0(java.lang.String str) {
        this.field_memberProviderFinderusername = str;
    }

    public final java.lang.String e() {
        return this.field_description;
    }

    public final void e0(int i17) {
        this.field_mentionSubtype = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd2.c)) {
            return false;
        }
        cd2.c cVar = (cd2.c) obj;
        return kotlin.jvm.internal.o.b(this.field_headUrl, cVar.field_headUrl) && kotlin.jvm.internal.o.b(this.field_nickname, cVar.field_nickname) && this.field_type == cVar.field_type && kotlin.jvm.internal.o.b(this.field_content, cVar.field_content) && this.field_createTime == cVar.field_createTime && kotlin.jvm.internal.o.b(this.field_thumbUrl, cVar.field_thumbUrl) && this.field_id == cVar.field_id && this.field_objectId == cVar.field_objectId && this.field_commentId == cVar.field_commentId && this.field_flag == cVar.field_flag && kotlin.jvm.internal.o.b(this.field_refContent, cVar.field_refContent) && this.field_extFlag == cVar.field_extFlag && this.field_mediaType == cVar.field_mediaType && kotlin.jvm.internal.o.b(this.field_description, cVar.field_description) && kotlin.jvm.internal.o.b(this.field_notify, cVar.field_notify) && kotlin.jvm.internal.o.b(this.field_replayUsername, cVar.field_replayUsername) && kotlin.jvm.internal.o.b(this.field_replayNickname, cVar.field_replayNickname) && kotlin.jvm.internal.o.b(this.field_objectNonceId, cVar.field_objectNonceId) && this.field_userVersion == cVar.field_userVersion && kotlin.jvm.internal.o.b(this.field_username, cVar.field_username) && kotlin.jvm.internal.o.b(this.field_contact, cVar.field_contact) && kotlin.jvm.internal.o.b(this.field_replyContact, cVar.field_replyContact) && kotlin.jvm.internal.o.b(this.field_aggregatedContacts, cVar.field_aggregatedContacts) && this.field_followExpireTime == cVar.field_followExpireTime && kotlin.jvm.internal.o.b(this.field_clientMsgId, cVar.field_clientMsgId) && this.field_followId == cVar.field_followId && this.field_objectType == cVar.field_objectType && this.field_refVideoObjectId == cVar.field_refVideoObjectId && kotlin.jvm.internal.o.b(this.field_refVideoObjectNonceId, cVar.field_refVideoObjectNonceId) && this.field_likeId == cVar.field_likeId && this.field_fansId == cVar.field_fansId && kotlin.jvm.internal.o.b(this.field_authorContact, cVar.field_authorContact) && this.field_likeType == cVar.field_likeType && kotlin.jvm.internal.o.b(this.field_commentMentionedUser, cVar.field_commentMentionedUser) && this.field_relationType == cVar.field_relationType && kotlin.jvm.internal.o.b(this.field_extInfo, cVar.field_extInfo) && this.field_svrMentionId == cVar.field_svrMentionId && kotlin.jvm.internal.o.b(this.field_finderUserName, cVar.field_finderUserName) && this.field_followFlag == cVar.field_followFlag && kotlin.jvm.internal.o.b(this.field_likeInfo, cVar.field_likeInfo) && kotlin.jvm.internal.o.b(this.field_thankInfo, cVar.field_thankInfo) && this.field_businessType == cVar.field_businessType && kotlin.jvm.internal.o.b(this.field_finderIdentity, cVar.field_finderIdentity) && this.field_sourceType == cVar.field_sourceType && this.field_mentionSubtype == cVar.field_mentionSubtype && kotlin.jvm.internal.o.b(this.field_followReason, cVar.field_followReason) && this.field_orderCount == cVar.field_orderCount && this.field_interactionCount == cVar.field_interactionCount && kotlin.jvm.internal.o.b(this.field_memberProviderFinderusername, cVar.field_memberProviderFinderusername) && this.field_forceUseContent == cVar.field_forceUseContent && this.field_rootCommentId == cVar.field_rootCommentId && kotlin.jvm.internal.o.b(this.field_svrReportInfo, cVar.field_svrReportInfo) && this.field_thankIconType == cVar.field_thankIconType && kotlin.jvm.internal.o.b(this.field_help_promotion_info, cVar.field_help_promotion_info) && kotlin.jvm.internal.o.b(this.field_svrMention, cVar.field_svrMention) && this.field_isSilentMention == cVar.field_isSilentMention && kotlin.jvm.internal.o.b(this.field_silentMentionEntityId, cVar.field_silentMentionEntityId) && kotlin.jvm.internal.o.b(this.field_aggregateTitle, cVar.field_aggregateTitle) && this.field_commentContentType == cVar.field_commentContentType && kotlin.jvm.internal.o.b(this.field_commentContentInfo, cVar.field_commentContentInfo) && this.field_jumpType == cVar.field_jumpType && kotlin.jvm.internal.o.b(this.field_jumpInfo, cVar.field_jumpInfo);
    }

    public final int f() {
        return this.field_extFlag;
    }

    public final void f0(java.lang.String str) {
        this.field_nickname = str;
    }

    public final r45.ub1 g() {
        return this.field_finderIdentity;
    }

    public final void g0(r45.rk2 rk2Var) {
        this.field_notify = rk2Var;
    }

    public final java.lang.String h() {
        return this.field_headUrl;
    }

    public final void h0(long j17) {
        this.field_objectId = j17;
    }

    public int hashCode() {
        java.lang.String str = this.field_headUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.field_nickname;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_type)) * 31;
        java.lang.String str3 = this.field_content;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_createTime)) * 31;
        java.lang.String str4 = this.field_thumbUrl;
        int hashCode4 = (((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Long.hashCode(this.field_id)) * 31) + java.lang.Long.hashCode(this.field_objectId)) * 31) + java.lang.Long.hashCode(this.field_commentId)) * 31) + java.lang.Integer.hashCode(this.field_flag)) * 31;
        java.lang.String str5 = this.field_refContent;
        int hashCode5 = (((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_extFlag)) * 31) + java.lang.Integer.hashCode(this.field_mediaType)) * 31;
        java.lang.String str6 = this.field_description;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        r45.rk2 rk2Var = this.field_notify;
        int hashCode7 = (hashCode6 + (rk2Var == null ? 0 : rk2Var.hashCode())) * 31;
        java.lang.String str7 = this.field_replayUsername;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.field_replayNickname;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.field_objectNonceId;
        int hashCode10 = (((hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_userVersion)) * 31;
        java.lang.String str10 = this.field_username;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.field_contact;
        int hashCode12 = (hashCode11 + (finderContact == null ? 0 : finderContact.hashCode())) * 31;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = this.field_replyContact;
        int hashCode13 = (hashCode12 + (finderContact2 == null ? 0 : finderContact2.hashCode())) * 31;
        r45.rg2 rg2Var = this.field_aggregatedContacts;
        int hashCode14 = (((hashCode13 + (rg2Var == null ? 0 : rg2Var.hashCode())) * 31) + java.lang.Long.hashCode(this.field_followExpireTime)) * 31;
        java.lang.String str11 = this.field_clientMsgId;
        int hashCode15 = (((((((hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31) + java.lang.Long.hashCode(this.field_followId)) * 31) + java.lang.Long.hashCode(this.field_objectType)) * 31) + java.lang.Long.hashCode(this.field_refVideoObjectId)) * 31;
        java.lang.String str12 = this.field_refVideoObjectNonceId;
        int hashCode16 = (((((hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31) + java.lang.Long.hashCode(this.field_likeId)) * 31) + java.lang.Long.hashCode(this.field_fansId)) * 31;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = this.field_authorContact;
        int hashCode17 = (((hashCode16 + (finderContact3 == null ? 0 : finderContact3.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_likeType)) * 31;
        r45.oy0 oy0Var = this.field_commentMentionedUser;
        int hashCode18 = (((hashCode17 + (oy0Var == null ? 0 : oy0Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_relationType)) * 31;
        r45.vg2 vg2Var = this.field_extInfo;
        int hashCode19 = (((hashCode18 + (vg2Var == null ? 0 : vg2Var.hashCode())) * 31) + java.lang.Long.hashCode(this.field_svrMentionId)) * 31;
        java.lang.String str13 = this.field_finderUserName;
        int hashCode20 = (((hashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_followFlag)) * 31;
        r45.t64 t64Var = this.field_likeInfo;
        int hashCode21 = (hashCode20 + (t64Var == null ? 0 : t64Var.hashCode())) * 31;
        r45.xg2 xg2Var = this.field_thankInfo;
        int hashCode22 = (((hashCode21 + (xg2Var == null ? 0 : xg2Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_businessType)) * 31;
        r45.ub1 ub1Var = this.field_finderIdentity;
        int hashCode23 = (((((hashCode22 + (ub1Var == null ? 0 : ub1Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_sourceType)) * 31) + java.lang.Integer.hashCode(this.field_mentionSubtype)) * 31;
        r45.r31 r31Var = this.field_followReason;
        int hashCode24 = (((((hashCode23 + (r31Var == null ? 0 : r31Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_orderCount)) * 31) + java.lang.Integer.hashCode(this.field_interactionCount)) * 31;
        java.lang.String str14 = this.field_memberProviderFinderusername;
        int hashCode25 = (((((hashCode24 + (str14 == null ? 0 : str14.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_forceUseContent)) * 31) + java.lang.Long.hashCode(this.field_rootCommentId)) * 31;
        java.lang.String str15 = this.field_svrReportInfo;
        int hashCode26 = (((hashCode25 + (str15 == null ? 0 : str15.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_thankIconType)) * 31;
        r45.fb1 fb1Var = this.field_help_promotion_info;
        int hashCode27 = (hashCode26 + (fb1Var == null ? 0 : fb1Var.hashCode())) * 31;
        r45.pg2 pg2Var = this.field_svrMention;
        int hashCode28 = (((hashCode27 + (pg2Var == null ? 0 : pg2Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_isSilentMention)) * 31;
        java.lang.String str16 = this.field_silentMentionEntityId;
        int hashCode29 = (hashCode28 + (str16 == null ? 0 : str16.hashCode())) * 31;
        java.lang.String str17 = this.field_aggregateTitle;
        int hashCode30 = (((hashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_commentContentType)) * 31;
        r45.e60 e60Var = this.field_commentContentInfo;
        int hashCode31 = (((hashCode30 + (e60Var == null ? 0 : e60Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.field_jumpType)) * 31;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.field_jumpInfo;
        return hashCode31 + (finderJumpInfo != null ? finderJumpInfo.hashCode() : 0);
    }

    public final long i() {
        return this.field_id;
    }

    public final void i0(java.lang.String str) {
        this.field_objectNonceId = str;
    }

    public final int j() {
        return this.field_mediaType;
    }

    public final void j0(long j17) {
        this.field_objectType = j17;
    }

    public final java.lang.String k() {
        return this.field_nickname;
    }

    public final void k0(int i17) {
        this.field_orderCount = i17;
    }

    public final long l() {
        return this.field_objectId;
    }

    public final void l0(java.lang.String str) {
        this.field_refContent = str;
    }

    public final java.lang.String m() {
        return this.field_objectNonceId;
    }

    public final void m0(long j17) {
        this.field_refVideoObjectId = j17;
    }

    public final r45.pg2 n() {
        return this.field_svrMention;
    }

    public final void n0(java.lang.String str) {
        this.field_refVideoObjectNonceId = str;
    }

    public final long o() {
        return this.field_svrMentionId;
    }

    public final void o0(int i17) {
        this.field_relationType = i17;
    }

    public final int p() {
        return this.field_type;
    }

    public final void p0(java.lang.String str) {
        this.field_replayNickname = str;
    }

    public final java.lang.String q() {
        return this.field_username;
    }

    public final void q0(java.lang.String str) {
        this.field_replayUsername = str;
    }

    public final java.lang.String r() {
        java.lang.String str = this.field_thumbUrl;
        return str == null ? "" : str;
    }

    public final void r0(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        this.field_replyContact = finderContact;
    }

    public final boolean s() {
        int i17 = this.field_extFlag;
        return (i17 & 2) > 0 || (i17 & 1) > 0;
    }

    public final void s0(long j17) {
        this.field_rootCommentId = j17;
    }

    public boolean t() {
        r45.rg2 rg2Var = this.field_aggregatedContacts;
        if (rg2Var != null) {
            kotlin.jvm.internal.o.d(rg2Var);
            if (rg2Var.getInteger(1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void t0(java.lang.String str) {
        this.field_silentMentionEntityId = str;
    }

    public java.lang.String toString() {
        return "FinderLiveMention(field_headUrl=" + this.field_headUrl + ", field_nickname=" + this.field_nickname + ", field_type=" + this.field_type + ", field_content=" + this.field_content + ", field_createTime=" + this.field_createTime + ", field_thumbUrl=" + this.field_thumbUrl + ", field_id=" + this.field_id + ", field_objectId=" + this.field_objectId + ", field_commentId=" + this.field_commentId + ", field_flag=" + this.field_flag + ", field_refContent=" + this.field_refContent + ", field_extFlag=" + this.field_extFlag + ", field_mediaType=" + this.field_mediaType + ", field_description=" + this.field_description + ", field_notify=" + this.field_notify + ", field_replayUsername=" + this.field_replayUsername + ", field_replayNickname=" + this.field_replayNickname + ", field_objectNonceId=" + this.field_objectNonceId + ", field_userVersion=" + this.field_userVersion + ", field_username=" + this.field_username + ", field_contact=" + this.field_contact + ", field_replyContact=" + this.field_replyContact + ", field_aggregatedContacts=" + this.field_aggregatedContacts + ", field_followExpireTime=" + this.field_followExpireTime + ", field_clientMsgId=" + this.field_clientMsgId + ", field_followId=" + this.field_followId + ", field_objectType=" + this.field_objectType + ", field_refVideoObjectId=" + this.field_refVideoObjectId + ", field_refVideoObjectNonceId=" + this.field_refVideoObjectNonceId + ", field_likeId=" + this.field_likeId + ", field_fansId=" + this.field_fansId + ", field_authorContact=" + this.field_authorContact + ", field_likeType=" + this.field_likeType + ", field_commentMentionedUser=" + this.field_commentMentionedUser + ", field_relationType=" + this.field_relationType + ", field_extInfo=" + this.field_extInfo + ", field_svrMentionId=" + this.field_svrMentionId + ", field_finderUserName=" + this.field_finderUserName + ", field_followFlag=" + this.field_followFlag + ", field_likeInfo=" + this.field_likeInfo + ", field_thankInfo=" + this.field_thankInfo + ", field_businessType=" + this.field_businessType + ", field_finderIdentity=" + this.field_finderIdentity + ", field_sourceType=" + this.field_sourceType + ", field_mentionSubtype=" + this.field_mentionSubtype + ", field_followReason=" + this.field_followReason + ", field_orderCount=" + this.field_orderCount + ", field_interactionCount=" + this.field_interactionCount + ", field_memberProviderFinderusername=" + this.field_memberProviderFinderusername + ", field_forceUseContent=" + this.field_forceUseContent + ", field_rootCommentId=" + this.field_rootCommentId + ", field_svrReportInfo=" + this.field_svrReportInfo + ", field_thankIconType=" + this.field_thankIconType + ", field_help_promotion_info=" + this.field_help_promotion_info + ", field_svrMention=" + this.field_svrMention + ", field_isSilentMention=" + this.field_isSilentMention + ", field_silentMentionEntityId=" + this.field_silentMentionEntityId + ", field_aggregateTitle=" + this.field_aggregateTitle + ", field_commentContentType=" + this.field_commentContentType + ", field_commentContentInfo=" + this.field_commentContentInfo + ", field_jumpType=" + this.field_jumpType + ", field_jumpInfo=" + this.field_jumpInfo + ')';
    }

    public final void u(java.lang.String str) {
        this.field_aggregateTitle = str;
    }

    public final void u0(int i17) {
        this.field_sourceType = i17;
    }

    public final void v(r45.rg2 rg2Var) {
        this.field_aggregatedContacts = rg2Var;
    }

    public final void v0(r45.pg2 pg2Var) {
        this.field_svrMention = pg2Var;
    }

    public final void w(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        this.field_authorContact = finderContact;
    }

    public final void w0(long j17) {
        this.field_svrMentionId = j17;
    }

    public final void x(int i17) {
        this.field_businessType = i17;
    }

    public final void x0(java.lang.String str) {
        this.field_svrReportInfo = str;
    }

    public final void y(java.lang.String str) {
        this.field_clientMsgId = str;
    }

    public final void y0(int i17) {
        this.field_thankIconType = i17;
    }

    public final void z(r45.e60 e60Var) {
        this.field_commentContentInfo = e60Var;
    }

    public final void z0(r45.xg2 xg2Var) {
        this.field_thankInfo = xg2Var;
    }
}
