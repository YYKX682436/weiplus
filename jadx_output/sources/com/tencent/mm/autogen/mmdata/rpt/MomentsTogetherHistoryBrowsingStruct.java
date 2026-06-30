package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class MomentsTogetherHistoryBrowsingStruct extends jx3.a {
    public MomentsTogetherHistoryBrowsingStruct() {
        j("IfRedDot", 0);
        j("Source", 0);
        j("OwnerSetting", 0);
        j("WithFriendFeedCount", 0);
        j("WithFriendExtraFeedCount", 0);
        j("WithFriendFeedTime", 0);
        j("WithFriendGalleryCount", 0);
        j("WithFriendDetailCount", 0);
        j("WithFriendDetailTime", 0);
        j("WithFriendDetailAction", "");
        j("IsClickFriendList", 0);
        j("PageOwnerUsername", "");
    }

    @Override // jx3.a
    public int g() {
        return 24777;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(f("IfRedDot"));
        stringBuffer.append(",");
        stringBuffer.append(f("Source"));
        stringBuffer.append(",");
        stringBuffer.append(f("OwnerSetting"));
        stringBuffer.append(",");
        stringBuffer.append(f("WithFriendFeedCount"));
        stringBuffer.append(",");
        stringBuffer.append(f("WithFriendExtraFeedCount"));
        stringBuffer.append(",");
        stringBuffer.append(f("WithFriendFeedTime"));
        stringBuffer.append(",");
        stringBuffer.append(f("WithFriendGalleryCount"));
        stringBuffer.append(",");
        stringBuffer.append(f("WithFriendDetailCount"));
        stringBuffer.append(",");
        stringBuffer.append(f("WithFriendDetailTime"));
        stringBuffer.append(",");
        stringBuffer.append(f("WithFriendDetailAction"));
        stringBuffer.append(",");
        stringBuffer.append(f("IsClickFriendList") != null ? f("IsClickFriendList").toString() : -1);
        stringBuffer.append(",");
        stringBuffer.append(f("PageOwnerUsername"));
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("IfRedDot:");
        stringBuffer.append(f("IfRedDot"));
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(f("Source"));
        stringBuffer.append("\r\nOwnerSetting:");
        stringBuffer.append(f("OwnerSetting"));
        stringBuffer.append("\r\nWithFriendFeedCount:");
        stringBuffer.append(f("WithFriendFeedCount"));
        stringBuffer.append("\r\nWithFriendExtraFeedCount:");
        stringBuffer.append(f("WithFriendExtraFeedCount"));
        stringBuffer.append("\r\nWithFriendFeedTime:");
        stringBuffer.append(f("WithFriendFeedTime"));
        stringBuffer.append("\r\nWithFriendGalleryCount:");
        stringBuffer.append(f("WithFriendGalleryCount"));
        stringBuffer.append("\r\nWithFriendDetailCount:");
        stringBuffer.append(f("WithFriendDetailCount"));
        stringBuffer.append("\r\nWithFriendDetailTime:");
        stringBuffer.append(f("WithFriendDetailTime"));
        stringBuffer.append("\r\nWithFriendDetailAction:");
        stringBuffer.append(f("WithFriendDetailAction"));
        stringBuffer.append("\r\nIsClickFriendList:");
        stringBuffer.append(f("IsClickFriendList") != null ? f("IsClickFriendList").toString() : -1);
        stringBuffer.append("\r\nPageOwnerUsername:");
        stringBuffer.append(f("PageOwnerUsername"));
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setIfRedDot(long j17) {
        j("IfRedDot", java.lang.Long.valueOf(j17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setIsClickFriendList(cm.c cVar) {
        j("IsClickFriendList", cVar);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setOwnerSetting(int i17) {
        j("OwnerSetting", java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setPageOwnerUsername(java.lang.String str) {
        j("PageOwnerUsername", b("PageOwnerUsername", str, true));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setSource(long j17) {
        j("Source", java.lang.Long.valueOf(j17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setWithFriendDetailAction(java.lang.String str) {
        j("WithFriendDetailAction", b("WithFriendDetailAction", str, true));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setWithFriendDetailCount(long j17) {
        j("WithFriendDetailCount", java.lang.Long.valueOf(j17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setWithFriendDetailTime(long j17) {
        j("WithFriendDetailTime", java.lang.Long.valueOf(j17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setWithFriendExtraFeedCount(long j17) {
        j("WithFriendExtraFeedCount", java.lang.Long.valueOf(j17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setWithFriendFeedCount(long j17) {
        j("WithFriendFeedCount", java.lang.Long.valueOf(j17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setWithFriendFeedTime(long j17) {
        j("WithFriendFeedTime", java.lang.Long.valueOf(j17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct setWithFriendGalleryCount(long j17) {
        j("WithFriendGalleryCount", java.lang.Long.valueOf(j17));
        return this;
    }
}
